import java.util.Scanner;
/**
 * Lab05 Assignment3a
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class PseudoCodeOne
{
    
    
    public static void main(String[] args)
    {
        int total = 0;
        int gradeCounter = 1;
        Scanner input = new Scanner(System.in);
        
        while (gradeCounter <= 10)
        {
            System.out.println("Enter the next Grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
        }
            
        double classAverage = total/10;
        System.out.println("The class average is: " + classAverage);
        
    }
}
