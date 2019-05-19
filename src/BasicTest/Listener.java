package BasicTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Step 1: implement ItestListener interface
public class Listener implements ITestListener 
{
	//step 2: add all unimplemented methods
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		System.out.println("we are successfully implementing all Tc's");
		System.out.println("successfull methods"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("failed method"+result.getMethod());
		//result.getName()- it will displaythe name of the failed testmethod
		//It is from ITestResult class
		System.out.println("failed2"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
