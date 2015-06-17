/**
* Interpreter.java
*
* A public interface for a generic interpreter 
*/

public interface Interpreter
{
   // Should write to the console the following:
   // "Interpreting a <target language> program"
   public void evaluate(AST program);
}
