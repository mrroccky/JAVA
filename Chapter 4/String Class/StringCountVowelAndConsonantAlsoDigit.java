/*
   Write program to count the number vowel,cosonant
   and Digit present in the input string 
   from keyword. 
  */
class StringCountVowelAndConsonantAlsoDigit
{
	public static void main(String args[]) 
	{
		String a;
		char c;
		int i,len;
		int countVowel=0,countDigit=0,countConsonant=0;
		a=args[0];
		len=a.length();
		for(i=0;i<len;i++)
		{
		   c=a.charAt(i);
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		   {
			   countVowel++;
		   }
		   else if(Character.isDigit(c))
		   {
			   countDigit++;
		   }
		   else
		   {
			   countConsonant++;
		   }
        }
		System.out.println("Numbers of Vowel are="+countVowel);
		System.out.println("Numbers of Consonant are="+countConsonant);
		System.out.println("Numbers of Digit are="+countDigit);
	}
}
