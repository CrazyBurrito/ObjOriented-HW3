/**
* Game.java
*
* A simple game simulator, used to test the GamePad and Keyboard input.
*
* Note:  You may only modify the following two lines of code:
*
* Line 20: private GamePad gamePad;
* Line 26: gamePad = new GamePad();
*
* These modifications shouldn't change the variable name, just the types.
*/

import java.util.Map;
import java.util.HashMap;

class Game
{
   // Your solution may change the type of gamePad from a GamePad object to some other object
   private GamePad gamePad;
   private Keyboard keyboard;

   public Game()
   {
      // Your solution should ONLY modify the next line of code.
      gamePad = new GamePad();
 
      // Your solution should NOT modify this line of code.... 
      keyboard = Keyboard.getInstance();
   }


   private Map<String, Boolean> initializeOracle()
   {
      Map<String, Boolean> oracle = new HashMap<String, Boolean>();
      oracle.put("UP", false);
      oracle.put("DOWN", false);
      oracle.put("LEFT", false);
      oracle.put("RIGHT", false);
      oracle.put("A", false);
      oracle.put("B", false);

      return oracle;
   }


   private boolean compareStates(Map<String, Boolean> map1, Map<String, Boolean> map2)
   {
      boolean areSame = true;

      for(String k : map1.keySet())
      {
         if(!map2.containsKey(k) || map2.get(k) != map1.get(k))
         {
            areSame = false;
         } 
      }
      return areSame;
   } 
   

   private void runTest()
   {
      Map<String, Boolean> oracle = initializeOracle(); 

      System.out.println("=== Game Simulator Test ===");
      System.out.println("A sequence of buttons on the game pad, and the corresponding keys on a keyboard will be pressed.");
      System.out.println("After each test, the gamePad game state will be checked against an oracle.");
      System.out.println("===========================");

      //--- Test 1 ---

      System.out.print("Press UP ('i' on keyboard) - ");

      gamePad.pressButton("UP");
      keyboard.pressKey("i");
      oracle.put("UP", true);
       
      if(compareStates(oracle, gamePad.getControllerState()))
      {
         System.out.println("PASSED!");
      }
      else
      {
         System.out.println("FAILED!");
      } 

      //--- Test 2 ---

      System.out.print("Press A ('a' on keyboard) - ");

      gamePad.pressButton("A");
      keyboard.pressKey("a");
      oracle.put("A", true);
       
      if(compareStates(oracle, gamePad.getControllerState()))
      {
         System.out.println("PASSED!");
      }
      else
      {
         System.out.println("FAILED!");
      } 

      //--- Test 3 ---

      System.out.print("Release Up ('i' on keyboard) - ");

      gamePad.releaseButton("UP");
      keyboard.pressKey("i");
      oracle.put("UP", false);
       
      if(compareStates(oracle, gamePad.getControllerState()))
      {
         System.out.println("PASSED!");
      }
      else
      {
         System.out.println("FAILED!");
      } 

      //--- Test 4 ---

      System.out.print("Press Down ('k' on keyboard) - ");

      gamePad.releaseButton("DOWN");
      keyboard.pressKey("k");
      oracle.put("DOWN", false);
       
      if(compareStates(oracle, gamePad.getControllerState()))
      {
         System.out.println("PASSED!");
      }
      else
      {
         System.out.println("FAILED!");
      } 


   } 

   public static void main(String[] args)
   {
      Game game = new Game();
      game.runTest();
   }
}
