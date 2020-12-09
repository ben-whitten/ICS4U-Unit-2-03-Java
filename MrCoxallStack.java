/*
* The MrCoxallStack program implements an application that
* creates a stack and allows you to edit it.
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
  private String poppedNumber;
  private int position;
  private String stackValues;

  /////////////////////////////////////////////////////////////////////////////
  // Push function.
  public void push(int addition) {
    someStack.add(addition);
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * Pop function.
   */
  public String pop() {
    try {
      poppedNumber = "Popped: ";
      poppedNumber += someStack.get(someStack.size() - 1);
      someStack.remove(someStack.size() - 1);

    } catch (Exception e) {
      poppedNumber = "-1";
    }
    
    return poppedNumber;
  }

  /////////////////////////////////////////////////////////////////////////////
  // Show function.
  public String show() {
    try {
      stackValues = "Current Stack Values: ";
      stackValues += someStack.get(0);
      position = 1;
      if (someStack.size() > 0) {
        for (position = 1; position < someStack.size(); position++) {
          stackValues = stackValues + ", " + someStack.get(position);
        }
      }

    } catch (Exception e) {
      stackValues = "-1";
    }
    return stackValues;
  }
}
