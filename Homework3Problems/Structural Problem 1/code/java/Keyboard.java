/**
* Keyboard
*
* A mock Keyboard object, which simulates user input through a keyboard.
*
* Note: You should not need to change or modify this file!
*/

class Keyboard 
{
   private KeyboardListener listener;
   private static Keyboard instance = null;

   private Keyboard()
   {
      listener = null;
   }

   public void setListener(KeyboardListener listener)
   {
      this.listener = listener;
   }

   public static Keyboard getInstance()
   {
      if(instance == null)
      {
         instance = new Keyboard();
      }
      return instance;
   }

   // These are not part of the API - they simple ensure that the simulation runs.
   protected void pressKey(String key)
   {
      if(listener != null)
         listener.onKeyPress(key);
   }

   protected void releaseKey(String key)
   {
      if(listener != null)
         listener.onKeyRelease(key);
   }

   protected void pressButton(String button) { }
   protected void releaseButton(String button) { }
}
