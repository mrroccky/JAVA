package constructorInPackage;
class A
{
	A()
	{
		System.out.println("You are Constructor of Super Class");
	}
}
public class B extends A
{
	public B()
	{
		System.out.println("You are Constructor of Sub Class");
	}
}

