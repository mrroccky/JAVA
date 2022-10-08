/*
   Write a program to define constructor of Student having one constructor 
   read name and another constructor read roll number.
 */
class Student 
{
		String name;
		int roll_no;
		Student(String n)
		{
			name=n;
			System.out.println("Name of Student="+name);
		}
		Student(int r1)
		{
			roll_no=r1;
			System.out.println("Roll number of Student="+roll_no);
		}
		public static void main(String[] args) 
		{
			Student s1=new Student("Chetan");
			Student s2=new Student(1);

		}
}
