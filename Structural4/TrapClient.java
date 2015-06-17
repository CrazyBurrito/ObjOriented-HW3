
public class TrapClient {

	private Trap trap = TrapFactory.getTrap();
	
	public void trigger(){
		trap.trigger();
	}
}