/* Write a program to demonstrate Applet life cycle. */
import java.awt.*;
import java.applet.*;
public class AppletLifeCycleDemo1 extends Applet 
{
	
	public void init()
	{
		System.out.println("init method has been invoked");
	}
	public void start()
	{
		System.out.println("start method has been invoked");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint method has been invoked");
	}
	public void stop()
	{
		System.out.println("stop method has been invoked");
	}
    public void destory()
	{
		System.out.println("destory method has been invoked");	 
	}
}
/*
<applet code="AppletLifeCycleDemo1.class" width=100 height=100>
</applet>
*/

/*
   Note:-
          1] Applet is container.
		  2] Applet is used client side programming.
		  3] Applet is subclass of Panel.
		  4] Both Applet and Panel container have FlowLayout by default but we can change layout
		     by default all component is located(situated) center of Applet from left to right
			 and top to buttom.
		  5] Applet only has default constructor.
		     i.e Applet()
		  6] In Applet We can not need used main method because Applet works with their methods.
		  7] There are two way to run Applet.
		         1] By using appletviewer tool of JDK.
				 2] By using HTML code.

		  8] When we will make program for Applet. Then it must be important the class name must
		     be in public.
		  9] It is not important to write all methods of Applet.
		     But remember it is automatically execute in Background
---------------------------------------------------------------------------------------------------------

	   ** Advantage of Applet:-
		  -----------------------
		  1] It has fast response time.
		  2] It is secure.
		  3] It run on diffrent platforms.

	   ** Disadvantage  of Applet:-
	      -------------------------
		  1] It require plug in.

-------------------------------------------------------------------------------------------------------
           _______________________
          |_______________________|
		  |	Applet life cycle     |
		  |_______________________| 
          |_______________________|

		    Applet works with five methods which are given and explain below.
		      1] init().
			  2] start().
			  3] paint(Graphics).
			  4] stop().
			  5] destory().
			  
			  1] init():- 
                         1] This method is used for loading Applet.
						 2] This method is used to inialized the objects.
						 3] It calls only once in Applet.
						 4] This method is present in java.applet package.

			  2] start():-
			             1] This method is executed after init() method.
						 2] It is used to start Applet.
						 3] It is also executed when Applet is maximize.
						 4] This method is called numbers of time depending upon numbers of time it will maximize.
						 5] This method is present in java.applet package.
	
			 3] paint(Graphics g):-
			                            
						 1] This method is executed after start method.
						 2] It is used to paint the Applet.
						 3] This method is present or part of java.awt package.
						 4] We must import java.awt package when we define paint method otherwise it must not need
						    to write.
                         5] It is also executed when Applet it Maximize.
						 6] This method is also called numbers of time depending upon numbers of time it will maximize.
						 7] And this also executed when we increase or decrease size of Applet.
			 4] stop():-
			        
				         1] This method is executed after paint method.
						 2] It is used to stop Applet.
						 3] It is also executed when Applet it minimize.
                         4] This method is called numbers of time depending upon numbers of time it will minimize.
						 5] This method is also executed when Applet is closed.
						 6] This method is present in java.applet package.
			             5] This method is present in java.applet package.
			
			5] destory():-
			              
						1] This method is executed after stop method.
						2] This method is used to destory Applet.
						3] This method call only once in whole life cycle of Applet.
						4] This method free resource.




*/