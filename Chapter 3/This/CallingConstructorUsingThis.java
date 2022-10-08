/*Write a program to call constructor using this.*/
class CallingConstructorUsingThis
{
    CallingConstructorUsingThis()
	{
		this("John",1);
	}
	CallingConstructorUsingThis(String n,int rn)
	{
		System.out.println("Name="+n+"\nRoll Number="+rn);
	}
	public static void main(String args[])
	{
		CallingConstructorUsingThis d=new CallingConstructorUsingThis();
	}
}