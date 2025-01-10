use sample_db;
#1. Prepare a program to display the comma separated list of employee names in following format
#   Deptno    Employees
#   -------   ------------
#   10        Scott, Smith, Jones
#   20        Allen, Ford
#   30 

delimiter $
create procedure deptwiseemp()
begin
	declare dept_no int;
	declare Employees varchar(50);
	declare rowcount int;
	declare cur cursor for select deptno, GROUP_CONCAT(ename SEPARATOR ', ') from emp group by deptno;
	select count(*) into rowcount from (select distinct deptno from emp group by deptno) e;
	create temporary table temp(deptno int,Employee varchar(50));
	open cur;
		curloop:loop
			if(rowcount=0) then leave curloop;
			end if;
			fetch cur into dept_no,Employees;
			insert into temp values(dept_no,Employees);
			set rowcount=rowcount-1;
		end loop curloop;
	close cur;
	select * from temp;
	drop table temp;
end$
delimiter ;
call deptwiseemp();

#2. Prepare a program to show the details in following format
#	Deptno   Dname      Employees
#	-------  -------    -------------
#	10        SALES     Scott, Smith, Jones

delimiter $
create procedure temp(in dept_no int)
begin
	declare dept_name varchar(15);
	declare Employees varchar(50);
	declare cur cursor for select dname, GROUP_CONCAT(ename SEPARATOR ', ') from emp,dept where emp.deptno=dept_no and dept.deptno=emp.deptno;
	create temporary table temp2(dept_name varchar(15),Employees varchar(50));
	open cur;
		fetch cur into dept_name,Employees;
		insert into temp2 values(dept_name,Employees);
	close cur;
	select * from temp2;
	drop table temp2;
end$
delimiter ;
call temp(30);

/*

3. For performance testing we are trying to increase number of records by 10 times for each department. For eg: If there are 3 employees in dept 10 then we should be able to increase the employee count to 30 using same / random values 

eg:

+-------+--------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+--------+-----------+------+------------+------+------+--------+
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |


should become


+-------+--------+-----------+------+------------+------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL  | COMM | DEPTNO |
+-------+--------+-----------+------+------------+------+------+--------+
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7783 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7784 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7785 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7786 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7787 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
...........
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7840 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7841 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7842 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7843 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7844 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
...........
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
	
	
	
4. Prepare a program to create clone of all tables in given schema

*/