/**
* ExampleTrap2.java
*
* One of Bob's traps
*/

public class ExampleTrap2
{
  public ExampleTrap2()
  {
    // This trap consists of four glue spots, followed by two nets, 
    // and finished with tying up with three ropes

    GlueSpot glueSpot1 = new GlueSpot();
    GlueSpot glueSpot2 = new GlueSpot();
    GlueSpot glueSpot3 = new GlueSpot();
    GlueSpot glueSpot4 = new GlueSpot();

    Net net1 = new Net();
    Net net2 = new Net();

    Rope rope1 = new Rope(); 
    Rope rope2 = new Rope(); 
    Rope rope3 = new Rope(); 
  }

  public void trigger()
  {
    glueSpot1.stick();
    glueSpot2.stick();
    glueSpot3.stick();
    glueSpot4.stick();

    net1.entangle();
    net2.entangle();

    rope1.tie();
    rope2.tie();
    rope3.tie();
  }
}
