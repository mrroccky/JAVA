/*Write a program to find Cube root of enter number using static import.*/
import static java.lang.Math.*;
class CubeRootRootUsingStaticImport
{
	public static void main(String args[]) 
	{
		int a;
		a=Integer.parseInt(args[0]);
		System.out.println("Cube root is="+Math.cbrt(a));
	}
}