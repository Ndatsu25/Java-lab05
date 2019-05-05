import java.util.Scanner;
/**
 * Lab05 Assignment3c
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class PeudoCodeThree
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       int passes = 0;
       int failures = 0;
       int studentCounter = 1;
       
       
       while (studentCounter <= 10)
       {
          System.out.println("Enter the exam result: ");
          int result = input.nextInt();
          
          if (result > 45)
          passes++;
          else
          failures++;
          
          studentCounter++;
       }
       
       System.out.println("The number of passes is: " + passes);
       System.out.println("The number of failures is: " + failures);
       
       if (passes > 8)
       {
           System.out.println("Excellent to instructor");
       }
       else 
       {
           System.out.println("Poor Result");
       }
   }
}
