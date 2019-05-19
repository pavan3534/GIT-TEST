package BasicTest;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void webCarLoan()
	{
		System.out.println("webcarloan");
	}
	@Test
	public void mobCarLoan()
	{
		System.out.println("mobcarloan");
	}
	@Test(groups={"Smoke"})
	public void apiCarLOan()
	{
		System.out.println("Apicarloan");
	}
	@Test
	public void failMethod()
	{
		Assert.assertTrue(false);
	}
}
