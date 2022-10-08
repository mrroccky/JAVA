package defaultMethodInInterfaceUsingPackage;
public interface DefaultMethodInInterface
{
	void  interfacemethod();
	default public void defaultMethod()
	{
		System.out.println("You are default method demo");
	}
}