/**
* BetterException.java
*
* A better way of handling exceptions, with excpetion levels
*/

import java.lang.StringBuffer;

public class BetterException
{
    public static final int WARNING = 0;
	public static final int LOW = 1;
	public static final int MODERATE = 2;
	public static final int HIGH = 3;
	public static final int CRITICAL = 4;
	
	private int exceptionLevel;
	private String msg;
	
	public BetterException(int exceptionLevel, String msg)
	{
	    this.exceptionLevel = exceptionLevel;
		this.msg = msg;
	}

	
	public int getExceptionLevel()
	{
	    return exceptionLevel;
	}
	
	
    public String toString()
	{
	    StringBuffer s = new StringBuffer();
		
		switch(exceptionLevel)
		{
		    case WARNING:
			    s.append("WARNING: ");
				break;
			case LOW:
				s.append("LOW ERROR: ");
				break;
			case MODERATE:
				s.append("MODERATE ERROR: ");
				break;
			case HIGH:
				s.append("HIGH ERROR: ");
				break;
			case CRITICAL:
				s.append("CRITICAL ERROR: ");
				break;
		}
		s.append(msg);
		
		return s;
	}
}