import java.io.*;
class OutStreamDemo1 
{
	public static void main(String args[]) throws IOException 
	{
		int a[]={65,66,67,68,69,70};
		int i=0;
		OutputStream OutputStream1=new FileOutputStream("OutputStreamDemoFile.txt");
		while(i<a.length)
		{
		  OutputStream1.write(a[i]);
		  i++;
		}
	}
}
