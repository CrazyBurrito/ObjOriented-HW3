
public class Trap1 implements Trap {

	private Gluespot[] GlueSpots = new GlueSpot[2];
	private Net[] Nets = new Net[3];
	private Ropes[] Ropes = new Rope[1];

	public void trigger() {
        glueSpot1.stick();
        glueSpot2.stick();
        net1.entangle();
        net2.entangle();
        net3.entangle();
        rope1.tie();
	}
}