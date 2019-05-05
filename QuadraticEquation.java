import java.util.Scanner;
/**
 * CSC401 Lab05 Assignment 2.
 *
 * @author (Garba Ndatsu MubaraqU15/fns/csc/025)
 * @version (a version number or a date)
 */
public class QuadraticEquation
{
public static void main(String args[])
{
   
    
    
    Scanner Num = new Scanner(System.in);
    
    System.out.print("Enter value for a: ");
    double a = Num.nextDouble();
    System.out.print("Enter value for b: ");
    double b = Num.nextDouble();
    System.out.print("Enter value for c: ");
    double c = Num.nextDouble();
    
    Quadratic newQ = new Quadratic(a, b, c);
    
    
    double equat = Math.pow(b,2) - (4 * a * c);
    
    
   if ( equat > 0){
   System.out.println("The Roots are real and distint:");
   System.out.println("ROOT1 = " + newQ.rt1());
   System.out.println("\nROOT2 = " + newQ.rt2());
}
else if (equat < 0){
   System.out.println("The Roots are complex:");
   System.out.println("ROOT1 = " + newQ.rt1());
   System.out.println("\nROOT2 = " + newQ.rt2());
}
 else {
   System.out.println("The Roots are real and equal:");
   System.out.println("ROOT1 = " + newQ.rt1());
   System.out.println("ROOT2 = " + newQ.rt2());
}

    
}
}
