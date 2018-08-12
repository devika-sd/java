import java.util.*;
class star
{
public static void main(String args[])
{
	int i,j,n;
	Scanner e=new Scanner(System.in);
	System.out.println("enter the num");
	n=e.nextInt();
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
		if(j<=i)
		{
		 System.out.print("*");
		}
		if(i!=j)
		{
		System.out.print("\t");
		}
	}
	System.out.println();
	}
}
}
