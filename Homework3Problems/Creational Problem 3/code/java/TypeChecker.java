/**
* TypeChecker.java
*
* A public interface for a generic type checker 
*/

public interface TypeChecker 
{
   // Should write to the console the following:
   // "Type checking a <target language> program"
   // For this assignment, just return true 
   public boolean checkType(AST program);
}
