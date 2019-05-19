package BasicTest;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webHomeLoan()
	{
		System.out.println("webHomeLoan");
	}
	@Test(groups={"Smoke"})
	public void mobHomeLoan()
	{
		System.out.println("mobHomeLoan");
	}
	@Test(dependsOnMethods= {"webHomeLoan"})
	public void apiHomeLOan()
	{
		System.out.println("apiHomeLOan");
	}
}
