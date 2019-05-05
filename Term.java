
public class Term
{
   private double a, d;
   int n;
   private double tN, sN;
    
   public Term(double t1, double cd, int nOT)
   {
       
       if (nOT >= 1)
       {
           a = t1;
           d = cd;
           n = nOT;
       }
       else
       {
           System.out.println("The number of term (n) must be positive ");;
        }
       
       
   }
   
   public double getTerm()
   {
       
       return tN = a + (n -1) * d;
    }
   
   public double getSumOfTerm()
   {
       return sN = ((n/2) * (a + tN));
   }
}
