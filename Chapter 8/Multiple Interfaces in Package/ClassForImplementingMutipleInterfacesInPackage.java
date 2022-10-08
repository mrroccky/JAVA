import multipleInterfaces.*;
class ClassForImplementingMutipleInterfacesInPackage implements Meg1,Meg2,Meg3,Meg4
{
	   public void meg1Body()
	   {
		   System.out.println("You are defining body of meg1Body method.And You are also implementing Meg1 interface which are present in multipleInterfaces package.");
	   }
	   public void meg2Body()
	   {
		   System.out.println("You are defining body of meg2Body method.And You are also implementing Meg2 interface which are present in multipleInterfaces package.");
	   }
	   public void meg3Body()
	   {
		   System.out.println("You are defining body of meg3Body method.And You are also implementing Meg3 interface which are present in multipleInterfaces package.");
	   }
	   public void meg4Body()
	   {
		   System.out.println("You are defining body of meg4Body method.And You are also implementing Meg4 interface which are present in multipleInterfaces package.");
	   }
	   public static void main(String[] args) 
	   {
		   ClassForImplementingMutipleInterfacesInPackage c1=new ClassForImplementingMutipleInterfacesInPackage();
		   c1.meg1Body();
		   c1.meg2Body();
		   c1.meg3Body();
		   c1.meg4Body();
	   }
}