/*
  Write a program to calculate  volume of cube and reactangle
  by using method overloading.
/*-------------------------------------------------------------------------------------------------------*/

class MethodOverloading
{
	double length,radius,height,breath;
	double calreact,calcube;
    void volume(double l)
	{
		length=l;
        calreact=length*length*length;
		System.out.println("Volume of reactangle is="+calreact);
    }
	void volume(double l,double b,double h)
	{
		length=l;
		breath=b;
		height=h;
        calcube=length*height*breath;
		System.out.println("Volume of cube is="+calcube);
    }
    public static void main(String[] args) 
	{
		 MethodOverloading m1=new MethodOverloading();
	     m1.volume(2);
		 m1.volume(2,5,9);
	}
}
