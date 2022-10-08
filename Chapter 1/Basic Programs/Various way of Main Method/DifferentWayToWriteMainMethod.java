/*Write a program to demonstrate differenets way to write main method.*/
class GeneralMainMethod
{
	public static void main(String args[]) 
	{
		System.out.println("General main method.");
	}
}

class ChangingPositionOfStaticOfMainMethod
{
	  
	static public void main(String args[]) 
	{
		System.out.println("Here Changing position of static of main method.");
	}
}

class ChangingPositionOfAngularBracketArgsofMainMethod
{
	  
	public static void main(String[] arg) 
	{
		System.out.println("Here Changing position of angular bracket of agrs main method.");
	}
}

class ChangingArgsNameOfMainMethod
{
	  
	public static void main(String chetan[]) 
	{
		System.out.println("Change name Args to any name");
	}
}


class MainMethodUsingVarageArgument
{
	  
	public static void main(String... arg) 
	{
		System.out.println("Main method using varage argument.");
	}
}

/*Above varage argument works in JDK5 and Above JDKs.*/

class MainMethodUsingFinal
{
	  
	public final static void main(String arg[]) 
	{
		System.out.println("Main method using final.");
	}
}

class MainMethodUsingChangingOrderOfFinal
{
	  
	final public static void main(String arg[]) 
	{
		System.out.println("Main method using changing order of final.");
	}
}

class MainMethodUsingStrictfp
{
	  
	strictfp public static void main(String arg[]) 
	{
		System.out.println("Main method using strictfp.");
	}
}

/*Above strictfp works in JDK2 and Above JDKs.*/

class MainMethodUsingStrictfpWithFinal
{
	  
	strictfp final public static void main(String arg[]) 
	{
		System.out.println("Main method using strictfp with final.");
	}
}

class MainMethodUsingSynchronized
{
	  
	synchronized  public static void main(String arg[]) 
	{
		System.out.println("Main method using synchronized.");
	}
}
class MainMethodUsingSynchronizedWithFinal
{
	  
	synchronized final public static void main(String arg[]) 
	{
		System.out.println("Main method using synchronized with final.");
	}
}
class MainMethodUsingSynchronizedWithStrictfp
{
	  
	synchronized strictfp public static void main(String arg[]) 
	{
		System.out.println("Main method using synchronized with strictfp.");
	}
}

class MainMethodUsingSynchronizedAndFinalAndStrictfp
{
	  
	synchronized final strictfp public static void main(String arg[]) 
	{
		System.out.println("Main method using synchronized with final and strictfp.");
	}
}

class MainMethodUsingSynchronizedAndFinalAndStrictfpWithChangedOrder
{
	  
	strictfp  final public static synchronized  void main(String arg[]) 
	{
		System.out.println("Main method using synchronized with final and strictfp along with chaging order.");
	}
}

/*
   Note:-
          1] We can change order of public,strictfp ,sychronized and static modifiers. But we can not change position
		     of void.
		  2] If we change order of all above mention modifier compiler never give error.
		  3] Please refer some points which are given in between this program.
*/