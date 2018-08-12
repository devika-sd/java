package pack1;
import java.util.*;
public class pack1
{
	public void concurreny()
	{
		double num;
		int type;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the type of curreny");
		System.out.println("1.indian2dollor"+"\n"+"2.indian2euro"+"\n"+"3.indian2yen"+"\n"+"4.dollor2indian"+"\n"+"5.euro2indian"+"\n"+"6.yen2indian");
		type=s.nextInt();
		System.out.println("enter the amount");
		num=s.nextDouble();
		switch(type)
		{
		case 1:
			{
				in2do(num);
				break;
			}
		case 2:
			{
				in2eu(num);
				break;
			}
		case 3:
			{
				in2yen(num);
				break;
			}
		case 4:
			{
				do2in(num);
				break;
			}
		case 5:
			{
				eu2in(num);
				break;
			}
		case 6:
			{
				yen2in(num);
				break;
			}
		default:
			{
				System.out.println("invalid choice");
			}
		}
	}
	void in2do(double num)
	{
		double amt;
		amt=num/64;
		System.out.println(amt);
	}
	void in2eu(double num)
	{
		double amt;
		amt=num/54;
		System.out.println(amt);
	}
	void in2yen(double num)
	{
		double amt;
		amt=num/34;
		System.out.println(amt);
	}
	void do2in(double num)
	{
		double amt;
		amt=num*64;
		System.out.println(amt);
	}
	void eu2in(double num)
	{
		double amt;
		amt=num*54;
		System.out.println(amt);
	}
	void yen2in(double num)
	{
		double amt;
		amt=num*34;
		System.out.println(amt);
	}
}