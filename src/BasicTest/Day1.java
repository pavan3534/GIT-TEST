package BasicTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1
{
	public WebDriver driver;
	
	//System.setProperty("webdriver.chrome.driver","C:\\Pavan\\Selenium New\\SeleniumV2\\chromedriver.exe");
	//TestNG helper attribute enabled= true/False
  @Test(enabled=true)
  public void demo()
  {
	  System.out.println("hi");
	  System.out.println("hi1");
	  System.out.println("hi2");
	  
	  
  }
  
  //implementing parameter using TestNG.xml file and passing value using parameter key word
  @Test(parameters= {"url"})
  public void demo1(String url)
  {
	  System.out.println("hello");
	  System.out.println(url+" "+"parameter");
  }
  @Test(enabled=true)
  public void dataDriven() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Pavan\\Selenium New\\SeleniumV2\\chromedriver.exe");
	  Properties prop= new Properties();
	  
	  FileInputStream fis= new FileInputStream("C:\\Pavan\\Selenium New\\SeleniumV2\\TestNG Pratcise\\src\\BasicTest\\DataDriven.properties");
	  
	  prop.load(fis);
	  driver= new ChromeDriver();
	  System.out.println(prop.getProperty("browser"));
	  System.out.println(prop.getProperty("url"));
	  driver.get(prop.getProperty("url"));
  }
}
