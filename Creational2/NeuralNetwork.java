
import java.util.Random;

public class NeuralNetwork implements PrototypeNetwork {
    
    private double weights = new double[];
    
	public void NeuralNetwork() {}
        
    public Object clone() {
		return super.clone();
	}
    
    public void learn(){
        for(int i = 0; i<weights.length; i++){
            Random rand = new Random()
            weights[i] += rand.nextInt(100); 
        }
    }
    
    public int respond(){
        int sum = 0;
        for(int i = 0; i<weights.length; i++){
            sum += weights[i]; 
        }
        return sum;
    }
    

}