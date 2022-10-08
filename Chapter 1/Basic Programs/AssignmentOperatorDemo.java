/*Write a program to calculate Area of Circle where user enter radius*/
class  AreaOfCircle
{
	public static void main(String args[]) 
	{
		 double radius,AreaOfCicle;
		 radius=Double.parseDouble(args[0]);
		 AreaOfCicle=3.14*radius*radius;
		 System.out.println("Area of Circle is="+AreaOfCicle);
    }
}
