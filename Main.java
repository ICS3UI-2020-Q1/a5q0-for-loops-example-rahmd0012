import java.util.Scanner;
/**
 * The for loop example
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create the count variable
    int count = 1;
    // create the while loop to count at 10
    while(count<=10){
      // loop action: print number to the console
      System.out.println(count);
      // increase the counter
      count = count + 1;
    }

    // do the same thing with for loop
    for(int count2 = 0; count2 < 10; count2++){
      // loop action: print number
      System.out.println("Loop " + (count2+1));
    }
    
  }
}
