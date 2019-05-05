import java.util.*;
/**
 * csc401 Lab05 assignment 2 (QuadraticFormular) .
 *
 * @author (Garba Ndatsu Mubaraq U15/FNS/CSC/025)
 * @version ()
 */
public class Quadratic
{
    private double a, b, c;
    private double equat = Math.pow(b,2) - (4 * a * c);
   
    
    public Quadratic(double _a, double _b, double _c){
    a = _a;
    b = _b;
    c = _c;
    
    
    }

    
    public double rt1(){
    double root1 = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
    return root1;
    }
    
      public double rt2(){
    double root2 = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
    return root2;
    }
    
 
    
    
}
