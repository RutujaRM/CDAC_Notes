#1)
select d.department_name,concat(e.first_name,' ',e.last_name) as name,e.hire_date,e.salary 
from employees e inner join departments d on e.employee_id = d.manager_id where datediff(now(),hire_date)/365 >15;

#2)
 select manager_id,min(salary) from employees where manager_id is not  null group by manager_id having min(salary)>6000 order by min(salary) desc;
 
 #3)
		#1)
        SELECT concat(first_name,' ',last_name)as name ,salary,employee_id FROM employees 
		WHERE department_id IN (SELECT department_id FROM departments WHERE location_id IN (SELECT location_id FROM locations WHERE city = 'London'));
        #2)
        select last_name from employees where last_name like 's%';
        #3)
        select hire_date from employees where dayofweek(hire_date)=2 and month(hire_date)=10 and day(hire_date)<8;
        #4)
        select upper(concat(first_name,' ',last_name)) Name, upper(city) as city from employees left join departments on employees.department_id=departments.department_id
        left join locations on departments.location_id=locations.location_id;
        #5)
        select d.department_name,max(e.salary) from departments d inner join employees e on e.department_id = d.department_id group by e.department_id;
#4)
CREATE TABLE temp SELECT DISTINCT * FROM employees;
DROP TABLE employees;
ALTER TABLE temp RENAME TO employees;

#5)
CREATE INDEX month_index ON employees (hire_date);


#6)
CREATE VIEW emp_view AS SELECT employee_id,salary,concat(first_name,' ',last_name),department_id FROM employees;
update emp_view set salary =0 where employee_id=105;
delete from emp_view where employee_id = 106;
update emp_view set department_id = 0 where employee_id=108; (it is not updating value in view for record having id =108 because of foreign key constraints)
#7)
SELECT job_title, department_name, concat(first_name,' ',last_name) AS name, start_date FROM job_history JOIN jobs USING (job_id) JOIN departments USING (department_id) 
JOIN  employees USING (employee_id) WHERE start_date>="1993-01-01" AND start_date<="1997-08-31";

#8)
select CONCAT(e.first_name, ' ', e.last_name) AS emp_name,j.job_title,h.* from employees e join 
(select max(start_date), max(end_date),employee_id from job_history group by employee_id) h on e.employee_id=h.employee_id 
join jobs j on j.job_id=e.job_id where e.commission_pct = 0;

#9)
select e.first_name AS "Employee Name",  m.first_name AS "Manager" FROM employees e LEFT OUTER JOIN employees m ON e.manager_id = m.employee_id;

#10)
select e.first_name,e.last_name, d.department_name, l.city, l.state_province from employees e join departments d  ON e.department_id = d.department_id 
join locations l  ON d.location_id = l.location_id   where e.first_name LIKE  '%z%';

#11)
select e.first_name, e.last_name, d.department_id, d.department_name  from employees e 	right join departments d on e.department_id = d.department_id; 
 #12)
 SELECT e.first_name, e.last_name, e.salary   from employees e join employees s on e.salary < s.salary and s.employee_id = 182;

#13)
select e.first_name as "employee",  m.first_name as "manager" from employees e join employees m on e.manager_id = m.employee_id;

#14)
	#1)db.employees.find().sort({age:1}).pretty();
    #2)db.employees.find({gender:"Male"}).pretty();
    #3)db.employees.find({age:57}).pretty();
    #4) db.employees.find({$or :[{commission_pct : 0},{salary : {$gt : 12000}}]}).sort({department_id : 1}).sort({salary : -1}).pretty();
    #5)db.employees.update({first_name:"Steve",last_name:"Rogers"},{$set:{employee_id:"210"}},{upsert:true});