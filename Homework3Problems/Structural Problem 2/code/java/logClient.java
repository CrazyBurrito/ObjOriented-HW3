/**
* LogClient.java
*
* An example client for a logger
*/


public class LogClient
{
   // Change MyLoggerClass to your desired class
   private MyLoggerClass myLogger;

   private MyLoggerClass makeLogger(String language, boolean includeDate)
   {
      // Create an appropriate logger for the provided language and
      // log level above

      return null;   // This line should disappear
   }

   public static void main(String[] args)
   {
      MyLoggerClass logger1 = makeLogger("French", false);
      MyLoggerClass logger2 = makeLogger("French", true);
      MyLoggerClass logger3 = makeLogger("English", false);
      MyLoggerClass logger4 = makeLogger("English", true);

      // You may change the method calls below to account for your 
      // particular interface.  Your interface can have any signature
      // you need
      // Sample interface - logger.log(String msg, int level, int month, int day, int year) 
      logger1.log("Variable never used", 0, 1, 1, 2011);
      logger2.log("Security violation", 1, 2, 15, 2014);
      logger3.log("Variable is never used", 0, 1, 15, 2014);
      logger4.log("Security violation", 1, 12, 15, 2005); 
   }
}
