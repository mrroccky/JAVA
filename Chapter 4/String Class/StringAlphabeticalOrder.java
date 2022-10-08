/*
   Write to program Java which will  read a String and rewrite it in the aphabetical order.
   For example the word String should be  written as GINRST
 */
class StringAlphabeticalOrder
{
	public static void main(String args[]) 
	{
		String a;
		int x;
		int i,len,j;
		a=args[0];
		char tem;
		char b[]=a.toCharArray();
		len=a.length();
		for(i=0;i<len;i++)
		{
		
			for(j=0;j<len-1;j++)
			{
				if(b[j]>b[j+1])
				{
					tem=b[j];
					b[j]=b[j+1];
					b[j+1]=tem;
				}
			}
			 
		}
		for(i=0;i<len;i++)
		{
		    System.out.print(b[i]);
		}
		 
	}
}
 