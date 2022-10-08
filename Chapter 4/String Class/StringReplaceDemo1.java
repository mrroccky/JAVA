 /*Write a program to replace is word by was.*/ 
class StringReplaceDemo1 
{
	public static void main(String args[]) 
	{
		String a="Java is developed by Gosling in 1991";
		System.out.println("Before\n\n"+a);
		a=a.replace("is","was");
		System.out.println("\n\nAfter\n\n"+a+"\n\n");
	}
}
