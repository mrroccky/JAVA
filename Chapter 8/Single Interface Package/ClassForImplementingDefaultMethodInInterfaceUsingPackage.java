import defaultMethodInInterfaceUsingPackage.*;
class  ClassForImplementingDefaultMethodInInterfaceUsingPackage implements DefaultMethodInInterface
{
	public void  interfacemethod()
	{
		System.out.println("You are interface method Demo");
	}
	public static void main(String args[]) 
	{
	  ClassForImplementingDefaultMethodInInterfaceUsingPackage c1=new ClassForImplementingDefaultMethodInInterfaceUsingPackage();
	  c1.defaultMethod();
	  c1.interfacemethod();
	}
}