/*
Write a program scan 5 employee information
as empid empname and salary

print total salary and average salary

*/


import java.util.*;
class Employee
{
private
int id,sal;
String name;
public
Scanner ob=new Scanner(System.in);
	void get()
	{
	System.out.println("Enter Id");
	id=ob.nextInt();
	System.out.println("Enter Emp Name");
	name=ob.next();
	System.out.println("Enter Salary");
	sal=ob.nextInt();
}
	void show()
	{
	System.out.print(id);
	System.out.print("\t"+name);
	System.out.print("\t"+sal);
System.out.println();
	}
// return salary

int fun()
{
return(sal);
}

}

class Example6
{
public static void main(String args[])
{

Employee emp[]; 
emp=new Employee[5];
int i,sum=0;
double avg;
//memory allocation
for(i=0;i<3;i++)
{
emp[i]=new Employee();

}
//assignment
for(i=0;i<3;i++)
{
emp[i].get(); 
sum=sum+emp[i].fun();
}
avg=sum/3;
//printing
System.out.println("ID  \tName  \t  Salary\n");
System.out.println("-------------------------");
for(i=0;i<3;i++)
{
emp[i].show();
}
System.out.println("-------------------------");
System.out.println("Total Salary =" +sum);
System.out.println("Average Salary =" +avg);


}

}


/*
print employee information about max salary 
*/

