interface A
{
	interface B
	{
		void methodOfB();
		interface C
		{
			void methodOfC();
		}
	}
}
class NestingInterfaceClass3 implements A.B.C
{
	public void methodOfC()
	{
		System.out.println("You are implementing Body of Nested Interface C");
	}
	public static void main(String args[]) 
	{
		NestingInterfaceClass3 n1=new NestingInterfaceClass3();
		n1.methodOfC();
	}
}