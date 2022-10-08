import interfaceDemo.*;
class PackageInterfaceImplementClass implements InterfaceCreationInPackageDemo
{
	public void get()
	{
		System.out.println("We are implementing body of interface method of package");
		System.out.println("Value of a of package interface is="+a);
	}
	public static void main(String args[]) 
	{
		PackageInterfaceImplementClass p1=new PackageInterfaceImplementClass();
	    p1.get();
	}
}
