package BasicTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 
{
	//implementing group 
	@Test(groups={"Smoke"})
	public void demo3()
	{
		System.out.println("bye");
	}
	//implementing dataProvider in
	@Test(dataProvider="getData")
	public void demo4(String name, String pwd)
	{
		System.out.println("data provider method");
		System.out.println(name);
		System.out.println(pwd);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//set1
		data[0][0]="name1";
		data[0][1]="pwd1";
		//set2
		data[1][0]="name2";
		data[1][1]="pwd2";
		//set3
		data[2][0]="name3";
		data[2][1]="pwd3";
		
		return data;
	}

}
