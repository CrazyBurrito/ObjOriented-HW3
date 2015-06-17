/**
* Parser.java
*
* A public interface for a generic parser
*/

public interface Parser
{
   // Should write to the console the following:
   // "Parsing <filename> as a <target language> program"
   public AST parseFile(String filename);
}
