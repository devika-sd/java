package packmain;
import pack1.*;
import java.util.*;
class packmast
{
	public static void main(String args[])
	{
		int c;
		pack1 d=new pack1();
		System.out.println("enter the type conversion");
		System.out.println("1.currency conversion"+"\n"+"2.distance conversion");
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		switch(c)
		{
		case 1:
			{
				d.concurreny();
				break;
			}
		case 2:
			{
				System.out.println("invalid choice");
				//distance();
				break;
			}
		default:
			{
				System.out.println("invalid choice");
			}
		}
	}
}
