/**
* TestCode.java
*
* An example code to test the BetterException class
*/

public class TestCode
{
	BetterExceptionHandler exceptionHandler;
	
	public TestCode()
	{
		// Create an your exception handler here
	}
	
	public void handleException(BetterException e)
	{
		exceptionHandler.handle(e);
	}
	
	public static void main(String[] args)
	{
		TestCode test = new TestCode();
		
		// Test: Try out some exceptions
		BetterException e1 = new BetterException(BetterException.WARNING, "A warning");
		BetterException e2 = new BetterException(BetterException.LOW, "A warning");
		BetterException e3 = new BetterException(BetterException.MODERATE, "A warning");
		BetterException e4 = new BetterException(BetterException.HIGH, "A warning");
		BetterException e5 = new BetterException(BetterException.CRITICAL, "A warning");
		
		test.handleException(e1);
		test.handleException(e2);
		test.handleException(e3);
		test.handleException(e4);
		test.handleException(e5);
	}
}