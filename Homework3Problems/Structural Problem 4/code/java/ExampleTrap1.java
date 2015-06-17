/**
* ExampleTrap1.java
*
* One of Bob's traps
*/

public class ExampleTrap1
{
  public ExampleTrap1()
  {
    // This trap consists of two glue spots, followed by three nets, 
    // and finished with tying up with rope

    GlueSpot glueSpot1 = new GlueSpot();
    GlueSpot glueSpot2 = new GlueSpot();
    Net net1 = new Net();
    Net net2 = new Net();
    Net net3 = new Net();
    Rope rope1 = new Rope(); 
  }

  public void trigger()
  {
    glueSpot1.stick();
    glueSpot2.stick();
    net1.entangle();
    net2.entangle();
    net3.entangle();
    rope1.tie();
  }
}
