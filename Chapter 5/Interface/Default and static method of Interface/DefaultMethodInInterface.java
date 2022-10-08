/* Write a program to demonstrate default method in interface.*/
interface DefaultMethodInInterface
{
	void interfacemethod();
	default void defaultMethod()
	{
		System.out.println("You are default method demo");
	}
}
class  ClassForImplementingDefaultMethodInInterface implements DefaultMethodInInterface
{
	public void  interfacemethod()
	{
		System.out.println("You are interface method Demo");
	}
	public static void main(String args[]) 
	{
	  ClassForImplementingDefaultMethodInInterface c1=new ClassForImplementingDefaultMethodInInterface();
	  c1.defaultMethod();
	  c1.interfacemethod();
	}
}
/*
Note:-
       1] In interface there is new launch in JDK8 that is default method.
	   2] By using this we can define body of method in interface.
	   3] We can create default method by using default keyword followed by normal method declaration.
	   4] There is not need to implements body of default method in implementing class.If we implement body of default method of 
	      interface in implementing class then error will generate.
	   5] This type of program run on only JDK8 and onward version. 
*/
