import java.util.Scanner;
/**
 * Lab05 Assignment3b
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class PseudoCodeTwo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int counter = 0;
        
       
        
        System.out.println("Enter first Grade: ");
        int grade1 = input.nextInt();        
        total = total + grade1;
        counter++;
        
        System.out.println("Enter the next Grade: ");
        int grade2 = input.nextInt();
        total = total + grade2;
        counter++;
        
        if (counter != 0)
        {
            int average = total/counter;
            System.out.println("The average = " + average);
        }
        else
        System.out.println("No grades were entered");
    }
}
