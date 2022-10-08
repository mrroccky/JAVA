/* Write a program to make nested Interface for Cat species.*/
interface CatAnimalInterface
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
class CatAnimalClass implements CatAnimalInterface,CatAnimalInterface.Cat,CatAnimalInterface.Cat.Tiger,CatAnimalInterface.Cat.Tiger.Lion
{
	public void methodOfCatAnimal()
	{
		System.out.println("You are in method of CatAnimalInterface i.e in main Interface CatAnimalInterface");
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
		CatAnimalClass g1=new CatAnimalClass();
		g1.methodOfCatAnimal();
		g1.methodOfCat();
		g1.methodOfTiger();
		g1.methodOfLion();
	}

}