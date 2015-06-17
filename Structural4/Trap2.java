
public class Trap2 implements Trap {

	private Gluespot[] GlueSpots = new GlueSpot[4];
	private Net[] Nets = new Net[2];
	private Ropes[] Ropes = new Rope[3];

	public void trigger() {
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