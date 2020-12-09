/*
* The MrCoxallStack program implements an application that
* creates a stack.
*
* @author  Ben Whitten
* @version 1.2
* @since   2020-12-9
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class MrCoxallStack {

  private ArrayList<Integer> someStack = new ArrayList<Integer>();

  // variables for later.
  private int poppedNumber;
  private int gottenNumber;

  /////////////////////////////////////////////////////////////////////////////
  // Push function.
  public void push(int addition) {
    someStack.add(addition);
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * Pop function.
   */
  public int pop(int size) {
    poppedNumber = someStack.get(size);
    someStack.remove(size);
    return poppedNumber;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  // Get function.
  public int get(int position) {
    gottenNumber = someStack.get(position);
    return gottenNumber;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  // Set function.
  public void set(int position, int newNumber) {
    someStack.set(position, newNumber);
  }
}
