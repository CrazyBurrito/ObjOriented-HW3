/**
* GamePad
*
* A mock GamePad object for simulating user input.
*
* Note: You do not need to modify this file to finish this part of the assignment,
* but if you need to have GamePad extend a class you create, that is fine.
*/

import java.util.Map;
import java.util.HashMap;

class GamePad
{
   private Map<String, Boolean> controllerState;

   public GamePad()
   {
      // Set up the controller state
      controllerState = new HashMap<String, Boolean>();

      // Set the initial state of each button to false
      controllerState.put("UP", false);
      controllerState.put("DOWN", false);
      controllerState.put("LEFT", false);
      controllerState.put("RIGHT", false);
      controllerState.put("A", false);
      controllerState.put("B", false);        
   }

   public Map<String, Boolean> getControllerState()
   {
      return controllerState;
   }


   // These are not part of the API - they exist for the sake of the simulation.
   protected void pressButton(String button)
   {
      controllerState.put(button, true);
   }

   protected void releaseButton(String button)
   {
      controllerState.put(button, false);
   }
}
