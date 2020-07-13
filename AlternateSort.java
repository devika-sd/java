import java.util.*;
import java.io.*;
public class AlternateSort
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of array");
		String n=s.nextLine();
		char[] c=n.toCharArray();
		int len=n.length();
		System.out.println(len);
		System.out.println(c);
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(c);
		for(int i=0,j=len-1;i<len/2&&j>=0;i++,j--)
		{
			System.out.print(c[i]);
			System.out.print(c[j]);
		}
	}
}
