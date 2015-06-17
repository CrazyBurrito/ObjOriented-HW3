/**
* KeyboardListener
*
* An interface for an object registered with a Keyboard.  These are
* callbacks to be implemented by the registered object.
*/

public interface KeyboardListener
{
   public void onKeyPress(String key);
   public void onKeyRelease(String key);
}
