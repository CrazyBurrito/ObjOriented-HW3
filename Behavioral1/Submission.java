/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Submission implements Subject
{	
    private Random myRandom();
	private boolean lastErrorWasTimeout;
    private List<Observer> observers;

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
    
    public void notifyObservers(){
        for (Observer obj : observers) {
            obj.update();
        }
    }
    
    public void unregister(Observer obj){
        observers.remove(obj);
    }
    
    public void register(Observer obj){
        observers.add(obj);
    }

}