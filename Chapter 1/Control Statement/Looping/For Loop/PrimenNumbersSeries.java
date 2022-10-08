/*Write a program to print prime numbers series where user enter the n*/
class PrimenNumbersSeries
{
	public static void main(String[] args) 
	{
		 int i,n,pos=1,j;
		 n=Integer.parseInt(args[0]);
		 for(i=2;i<=n;i++)
		 {
			 for(j=2;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 pos=-1;
					 break;
				 }
			 }
			 if(pos==1)
			 {
				 System.out.println(i);
			 }
			 pos=1;
		 }	
	}
}
