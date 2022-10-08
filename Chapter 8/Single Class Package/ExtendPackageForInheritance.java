import extendClassPackageDemo.*;
class ExtendPackageForInheritance extends InheritanceUsingPackage
{
	void methodCall()
	{
		System.out.println("You are calling package method");
		get();
	}
	public static void main(String args[]) 
	{
		ExtendPackageForInheritance e1=new ExtendPackageForInheritance();
		e1.methodCall();
		 
	}
}
