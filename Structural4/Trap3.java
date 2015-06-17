
public class Trap2 implements Trap {

	private Gluespot[] GlueSpots = new GlueSpot[2];
	private Ropes[] Ropes = new Rope[1];

	public void trigger() {
        glueSpot1.stick();
        glueSpot2.stick();

        rope.tie();
	}
}