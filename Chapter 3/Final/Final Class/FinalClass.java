/*Write a program to demonstrate Final class.*/
final class FinalClass
{
    void get() 
	{
		System.out.println("Method of getA of Super Class");
	}
}
class FinalClass1 extends FinalClass 
{
	void getB() 
	{
		System.out.println("Method of getB of Sub  Class");
	}
	public static void main(String args[]) 
	{
		FinalClass1 f1=new FinalClass1();
		f1.get();
	}
}
/*-----------------------------------------------------------------------
Output:-
        cannot inherit from final FinalClass.
 -------------------------------------------------------------------------*/
 /*
    Note:- 
	       1] Final class must not inherit.If we try this then compiler must give error and that error which is mention above output 
		   2] All Wrapper classess and String class are declared in Final.That simply mean that these classess is not inherit.
		   3] Final help to become class as Immutable class.
*/

