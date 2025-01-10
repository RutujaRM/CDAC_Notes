/*
Write a program scan elements and print maximum number
with row index and col index

*/
import java.util.Scanner;
class Test
{  
public static void main(String args[])
{  
Scanner obj=new Scanner(System.in);

int arr[][] = new int[3][4];
int i,j,max=0,x=0,y=0;
System.out.println("Enter Numbers");
for(i=0;i<3;i++)
   {
		for(j=0;j<4;j++)
		{
		arr[i][j]=obj.nextInt();
		  if(arr[i][j]>max)
			{
			max=arr[i][j];
			x=i;
			y=j;
			}

		}
	}
System.out.println("2 D Array");

for(i=0;i<3;i++)
{
	for(j=0;j<4;j++)
	{
System.out.print("\t" +arr[i][j]);
	}
	System.out.println();
}

System.out.println(+max+ "Value present at" +x+ "Row" +y+"Col");

}
}  