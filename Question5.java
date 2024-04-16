import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<>();
    int tries = in.nextInt();
    int max = 0;
    for(int i = 0; i < tries; i++) {
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        data.add(number);
        int count = Collections.frequency(data, number);
        if (count > max) {
            max = count;
        }
    }
    System.out.println(max);
  }
}
