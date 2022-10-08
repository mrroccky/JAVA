/* Write a program to check enter String is Palindrome or Not.*/
class StringDomainNameFinder
{
	public static void main(String args[]) 
	{
		String domain_name[]=
		                      { "www.google.com",
			                    "www.facebook.com",
			                    "www.gmail.com"};
		int i,beginIndex,lastIndex,i1;
		for(i=0;i<1;i++)
		{
			beginIndex=domain_name[i].indexOf('.');
			lastIndex=domain_name[i].indexOf('.');
			for(i1=beginIndex;i1<=lastIndex;i1++)
			{
				System.out.println(domain_name[i].charAt(i1));
			}
		}
	}
}

			
			                   