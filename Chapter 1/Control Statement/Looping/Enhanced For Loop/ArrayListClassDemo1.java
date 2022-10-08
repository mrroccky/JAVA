/*Write a program to demonstrate Enhanced for loop and use ArrayList class of storing number */
import java.util.*;
class ArrayListClassDemo1 
{
	public static void main(String args[]) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		for(Integer Numbers:numbers)
		{
			System.out.println(Numbers); 
		}
	}
}
