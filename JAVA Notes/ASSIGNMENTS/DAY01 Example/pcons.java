//Example of parameter  constructor

class samp
{
private
int a;
double b;
String s; 
public
//parameterless constructor
samp()
{
a=100;
b=45.788;
s="MET CDAC";
}

//parameterized 
samp(int x,double y,String str)
{
a=x;
b=y;
s=str;
}
samp(int x,String str)
{
a=x;
s=str;
}
void show()
{
System.out.println("A=" +a);
System.out.println("B=" +b);
System.out.println("String=" +s);
}

}

class pcons
{
public static void main(String args[])
{
samp s1=new samp();//parameterless
samp s2=new samp(12,"Students");
s1.show();
System.out.println();
s2.show();
System.out.println();
samp tt=new samp(100,45.78,"CDAC Student");
tt.show();
}

}

















