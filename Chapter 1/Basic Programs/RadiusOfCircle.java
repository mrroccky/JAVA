/*Write a program to calculate Radius of circle where user enter Diameter.*/
class  RadiusOfCircle
{
	public static void main(String args[]) 
	{
		 double diameter,radius;
		 diameter=Double.parseDouble(args[0]);
		 radius=diameter/2;
		 System.out.println("Radius of Circle is="+radius);
    }
}
