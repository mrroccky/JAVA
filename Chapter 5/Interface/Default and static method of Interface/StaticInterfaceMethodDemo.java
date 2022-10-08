/* Write a program define  interface  method as static.*/
interface Cube
{  
    void draw();  
    static int cube(int x){return x*x*x;}  
}  
class StaticInterfaceMethodDemo
{  
    public static void main(String args[])
	{  
       System.out.println(Drawable.cube(3));  
    }
	
}