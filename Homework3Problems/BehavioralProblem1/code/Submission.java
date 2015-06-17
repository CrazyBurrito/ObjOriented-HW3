/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;

public class Submission
{	
    private Random myRandom();
	private boolean lastErrorWasTimeout;

    // You may add attributes to this class if necessary

	public Submission()
	{
	    Random myRandom = new Random();
		lastErrorWasTimeout = false;
	
	    // Initialize attributes as necessary
	}

    public runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		boolean passed = myRandom.nextBoolean();
		
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}
		
		// If needed, you can add to the end of this method for reporting purposes
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}
}