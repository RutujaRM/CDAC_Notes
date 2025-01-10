//Example of this keyword

class Test
{
	private
	int a;
	double b;
	public
	//without return methods
		
	 void get(int a,double b) //formal parameter
		{
		this.a=a;
		this.b=b;   
		}

		void show()
		{
		System.out.println("A=" +a);
		System.out.println("B=" +b);
		
		}


}
	
		class Example3
		{
			public static void main(String args[])
		{
				Test T1=new Test();
				Test T2=new Test();
				
				T1.get(12,45.56); //Actual parameter
				T2.get(12,345.344);				
				T1.show();
			  System.out.println("-----------");
				T2.show();
			

		}
		}
//Example how to pass array main to function

		int a[]=new int[5];


main()
		int a[]=new int[20];

sort_fun(a); //call udmethod ( array a);



//method defination

void sort_fun(int a[])
{

}











