/**
* NeuralNetwork.java
*
* An abstract NN class.  You may extend this class to solve your problem,
* or use it as a guide, but the API must remain consistent.
*/

abstract class NeuralNetwork
{
   private double weights[4];

   public NeuralNetwork() {
      // initialize weights as you see fit (randomly)
   }

   public abstract void learn() {
      // add a random value to the weights 
   }

   public abstract double respond() {
      // just add up the weights and return the result
   }
}

