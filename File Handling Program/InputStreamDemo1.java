import java.io.*;
class InputStreamDemo1 
{
	public static void main(String args[]) throws IOException 
	{
		
		InputStream InputStream1=new FileInputStream("Ch.txt");
		int ch;
		while((ch=InputStream1.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}
}
