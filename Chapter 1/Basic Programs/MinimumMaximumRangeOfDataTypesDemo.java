/*Write a program to print Minimum and Maximum range of primitive data types in Java.*/
class MinimumMaximumRangeOfDataTypesDemo
{
	public static void main(String[] args) 
	{
		 int mini,maxi,minc,maxc;
		 double mind,maxd;
		 short mins,maxs;
		 long minl,maxl;
		 float minf,maxf;
		 byte minb,maxb;

		 mini=Integer.MIN_VALUE;
		 maxi=Integer.MAX_VALUE;
		 System.out.println("Range of integer(int) data type is="+mini+" to "+maxi);

		 minf=Float.MAX_VALUE;
		 maxf=Float.MIN_VALUE;
		 System.out.println("Range of float datatype is="+minf+" to "+maxf);
		 
		 mins=Short.MIN_VALUE;
		 maxs=Short.MAX_VALUE;
		 System.out.println("Range of short datatype is="+mins+" to "+maxs);
		 
		 minl=Long.MIN_VALUE;
		 maxl=Long.MAX_VALUE;
		 System.out.println("Range of long datatype is="+minl+" to "+maxl);
         
		 minc=Character.MIN_VALUE;
		 maxc=Character.MAX_VALUE;
		 System.out.println("Range of character(char) datatype is="+minc+" to "+maxc);
         
		 minb=Byte.MIN_VALUE;
		 maxb=Byte.MAX_VALUE;
		 System.out.println("Range of byte datatype is="+minb+" to "+maxb);
	}
}
