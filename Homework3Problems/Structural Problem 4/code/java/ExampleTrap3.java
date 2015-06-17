/**
* ExampleTrap3.java
*
* One of Bob's traps
*/

public class ExampleTrap3
{
  public ExampleTrap3()
  {
    // This trap consists of two glue spots and rope to tie up the intruder
    // There's not enough room in the building for nets :(

    GlueSpot glueSpot1 = new GlueSpot();
    GlueSpot glueSpot2 = new GlueSpot();

    Rope rope = new Rope(); 
  }

  public void trigger()
  {
    glueSpot1.stick();
    glueSpot2.stick();

    rope.tie();
  }
}
