abstract class vehicle
{
	int a=10;
	void fuel()
	{
		System.out.println("amount depents on petrol or diesel");
	}
	abstract public void ac();
	abstract public void power();
}
abstract class car extends vehicle
{
	int a=20;
	public void ac()
	{
	System.out.println("ac is neccessary");
	}
	public void power()
	{
	System.out.println("it may be present");
	}
}
class lorry extents car
{
	int a=30;
	public void ac()
	{
	System.out.println("ac is not neccessary");
	}
	public void power()
	{
	System.out.println("it not be present");
	}
}
class output 
{
public static void main(String args[])
{
	lorry t=new lorry();
	car c=new car();
	vehicle v=new vehicle();
	System.out.println(t.a);
	t.ac();
	t.power();
	System.out.println(c.a);
	c.ac();
	c.power();
	c.fuel();
	System.out.println(v.a);
	v.fuel();
}
}
