/*Write a program to demonstrate Initialization of Two Dimension Array.*/
class TwoDimensionArray1
{
 
     public static void main(String[] args) 
	 {
          int a[][]={{1,2,3},{4,5,6}}; 
		  int i,j;
          for(i=0;i<2;i++)
		  {
		     for(j=0;j<3;j++)
			 {
				 System.out.println(a[i][j]);
			 }
		  }
	 }
}