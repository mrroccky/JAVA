/*Write a program to call main method from static block.*/
class CallingMainMethodFromStaticBlock
{
	static String names[]={"Chetan","Mukesh"};
	static
	{
		System.out.println("Now You are calling main method");
		main(names);
	}
	public static void main(String args[]) 
	{
		int i;
		for(i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
