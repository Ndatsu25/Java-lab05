import java.util.Scanner;
/**
 * Lab05 Assignment1.
 *
 * @author (Garba Ndatsu Mubaraq U15/fns/csc/025)
 * @version (a version number or a date)
 */
public class ArithmeticProgression
{
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
        
    int a;
    int d;
    int n;
    int Tn;
    int Sn;
    
    System.out.println("Enter First term ");
    a = input.nextInt();
    
    System.out.println("Enter the common difference ");
    d= input.nextInt();
    
    System.out.println("Enter the number of terms ");
    n  = input.nextInt();
    
    if (n > 0){
    Tn = a +(n - 1)*d;
    System.out.println("The nth term is " + Tn);

    Sn = (n/2)*(a + Tn);
    System.out.println("The sum of the first n term is " + Sn);
}
    else {
    System.out.println("You entered a negative interger");
}
}
    
}
