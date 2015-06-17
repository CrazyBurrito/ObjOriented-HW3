/**
* Database.java
*
* A simple database simulation
*/

import java.lang.Thread;

public class Database {
  public Database() { }

  public void openDatabase()
  {
    System.out.println("Connecting to the database");
  }

  public void executeSQL(String sql)
  {
    System.out.println("Executing the SQL command: " + sql);
    System.out.println("(This can take some time....)");
   
    try { 
      Thread.sleep(5000);
    }
    catch (Expection e) { }    
  } 

  public closeDatabase() 
  {
    System.out.println("Closing the database");
  }
}
