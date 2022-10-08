/* 
   Write a program to make nested Interface for Cat species.
   And call nested interfaces methods using their Objects.
 */
interface CatAnimalInterface1
{
	void methodOfCatAnimal();
	interface Cat
	{
		void methodOfCat();
		interface Tiger
		{
			void methodOfTiger();
			interface Lion
			{
				void methodOfLion();
			}
	    }
	}
}
class CatAnimalClass1 implements CatAnimalInterface1,CatAnimalInterface1.Cat,CatAnimalInterface1.Cat.Tiger,CatAnimalInterface1.Cat.Tiger.Lion
{
	public void methodOfCatAnimal()
	{
		System.out.println("You are in method of CatAnimalInterface1 i.e in main Interface CatAnimalInterface1");
	}
	public void methodOfCat()
	{
		System.out.println("You are in method of methodOfCat of Interface Cat");
	}
	public void methodOfTiger()
	{
		System.out.println("You are in method of methodOfTiger of Interface Tiger");
	}
	public void methodOfLion()
	{
		System.out.println("You are in methodOfLion of Interface Lion");
	}
	public static void main(String args[])
	{
		CatAnimalInterface1.Cat g1=new CatAnimalClass1();
		g1.methodOfCatAnimal();
		g1.methodOfCat();
		g1.methodOfTiger();
		g1.methodOfLion();
	}
}