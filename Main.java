/*
* The Main program implements an application that
* can edit a stack.
*
* @author  Ben Whitten
* @version 1.2
* @since   2020-12-9
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handels all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Variables which will be used later.
    String option;
    int number;
    int poppedNumber;
    int size = -1;
    int position;
    int gottenNumber;
    int change;
    int newNumber;
    int tempNumber;

    // Creating MrCoxallStack.
    MrCoxallStack someStack = new MrCoxallStack();

    ///////////////////////////////////////////////////////////////////////////
    // This is the main portion of the program.
    while (true) {
      try {

        // Creating a scanner.
        Scanner scanOptions = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanPush = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanGet = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanSet = new Scanner(System.in);

        // Asking what to do.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
                           + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("What do you want to do? [push] [pop] [get] [set]"
                           + " [show]");
        option = scanOptions.nextLine();
        System.out.println();

        //////////////////////////////////////////////////////////////////////
        // Push to MrCoxallStack.
        if (option.equals("push")) {
          System.out.println("Insert a number to add to the stack:");
          number = scanPush.nextInt();
          System.out.println();

          someStack.push(number);
          System.out.println("pushed: " + number);
          System.out.println();
          size += 1;

        //////////////////////////////////////////////////////////////////////
        // Pop off MrCoxallStack.
        } else if (option.equals("pop")) {
          poppedNumber = someStack.pop(size);
          System.out.println("popped: " + poppedNumber);
          System.out.println();
          size -= 1;

        //////////////////////////////////////////////////////////////////////
        // Get from MrCoxallStack.
        } else if (option.equals("get")) {
          System.out.println("Insert a what number to get from the stack:");
          position = scanGet.nextInt();
          System.out.println();

          gottenNumber = someStack.get(position);
          System.out.println("got: " + gottenNumber);
          System.out.println();
          
        //////////////////////////////////////////////////////////////////////
        // Set a value in MrCoxallStack.
        } else if (option.equals("set")) {
          System.out.println("Insert a what number to change from the stack:");
          position = scanSet.nextInt();
          System.out.println();

          System.out.println("Insert what to change it to:");
          newNumber = scanSet.nextInt();
          System.out.println();

          gottenNumber = someStack.get(position);
          someStack.set(position, newNumber);

          System.out.println("set: " + gottenNumber + "(" + position + ") to "
                             + newNumber);
          System.out.println();
          
        //////////////////////////////////////////////////////////////////////
        //Show MrCoxallStack.
        } else if (option.equals("show")) {
          position = 0;
          for (position = 0; position <= size; position++) {
            gottenNumber = someStack.get(position);
            System.out.println(gottenNumber);
          }
          System.out.println();

        ///////////////////////////////////////////////////////////////////////
        // Catch invalid input at start.
        } else {
          System.out.println("ERROR: INVALID INPUT");
          System.out.println();
        }

      /////////////////////////////////////////////////////////////////////////
      // Catch anything else.
      } catch (Exception e) {
        System.out.println("ERROR: INVALID INPUT");
        System.out.println();
      }
    }
  }
}
