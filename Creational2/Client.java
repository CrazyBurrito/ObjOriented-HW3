
public class Client {

	public static void main( String arg[] ) 
	{
		NeuralNetwork obj1= new NeuralNetwork ();
        obj1.learn();
        obj1.learn();
        obj1.learn();
        
		NeuralNetwork obj2 = (NeuralNetwork)obj1.clone();
        
        System.out.println("obj1sum = " + obj1.respond());
        System.out.println("obj2sum = " + obj2.respond());
        obj2.learn();
        System.out.println("obj1sum = " + obj1.respond());
        System.out.println("obj2sum = " + obj2.respond());
	}

}