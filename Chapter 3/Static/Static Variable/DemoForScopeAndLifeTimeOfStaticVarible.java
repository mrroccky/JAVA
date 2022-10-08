class DemoForScopeAndLifeTimeOfStaticVarible
{
	static int a;
	void get()
	{
		System.out.println("Value of a="+a);
		a++;
	}
	public static void main(String[] args) 
	{
		DemoForScopeAndLifeTimeOfStaticVarible d1,d2,d3,d4;
		d1=new DemoForScopeAndLifeTimeOfStaticVarible();
		d2=new DemoForScopeAndLifeTimeOfStaticVarible();
		d3=new DemoForScopeAndLifeTimeOfStaticVarible();
		d4=new DemoForScopeAndLifeTimeOfStaticVarible();
		d1.get();
		d2.get();
		d3.get();
		d4.get();

	}
}
/*
Note:-
       1] Static variable is also called as class variable
	   2] It is part of class and not part of object.
	   3] static variable must be initialize by 0 by default(automatically).But other initialization is permitted .
	      For example:-
		              static int a=10;
	  4] We must not create static variable in body of static block,static method,constructor and non static method.
	  5] Static variable must access in static as well as non static method.
	  6] Scope and Life time of static variable is present  throught program.
	  7] We can call static variable by using class name because it is part of class not part of object.
	  8] We can call static variable using object but this is not world wide accepted(not most programmer know).
	  9] All variable in interface is by default static.
	 10] We can define Object in static 
	      For example:-
		                static Student s1;
						s1=new Student();
						here
                             Student is name of class.
	11] Only one copy of static variable is created for all Object.
*/
