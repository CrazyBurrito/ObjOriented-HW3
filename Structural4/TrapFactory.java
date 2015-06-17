
public class TrapFactory {

	private static Trap Trap;
	
	public static Trap getTrap(){
		
		if(Trap==null){
			Trap = new Trap();
		}
        
		return Trap;
	}
}