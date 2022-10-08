/* Write a program to make nested Interface for Cat species. And call nested interfaces methods using their Objects.*/
interface CatAnimalInterface1
{
	void methodOfCatAnimal();
	interface Cat
	{
		void methodOfCat();
	}
	interface Tiger
	{
		void methodOfTiger();
	}
	interface Lion
	{
		void methodOfLion();
	}
}
class CatAnimalClass1 implements CatAnimalInterface1,CatAnimalInterface1.Cat,CatAnimalInterface1.Tiger,CatAnimalInterface1.Lion
{
	public void methodOfCatAnimal()
	{
		System.out.println("You are in method of CatAnimalInterface1 i.e in main Interface CatAnimalInterface1");
	}
	public void methodOfCat()
	{
		System.out.println("You are in method of method Of Cat of Interface Cat");
	}
	public void methodOfTiger()
	{
		System.out.println("You are in method of method Of Tiger of Interface Tiger");
	}
	public void methodOfLion()
	{
		System.out.println("You are in method Of Lion of Interface Lion");
	}
	public static void main(String args[])
	{
		CatAnimalInterface1 g1=new CatAnimalClass();
		g1.methodOfCatAnimal();
		
		
		CatAnimalInterface1.Cat g2=new CatAnimalClass();
		g2.methodOfCat();

		CatAnimalInterface1.Tiger g3=new CatAnimalClass();
		g3.methodOfTiger();

		CatAnimalInterface1.Lion g4=new CatAnimalClass();
		g4.methodOfLion();
	}

}