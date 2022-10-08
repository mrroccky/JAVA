package singleInheritanceDemo;
class A
{
	void methodOfA()
	{
		System.out.println("You are in method Super Class");
	}
}
public class B extends A
{
	 public void methodOfB()
	 {
		 methodOfA();
		System.out.println("You are in method Sub Class");
	 }
}