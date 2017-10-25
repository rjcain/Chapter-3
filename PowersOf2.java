// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;
 
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        
            int nextPowerOf2 = 1;        
            int exponent = 0;               
            int product;   
            
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed?");
            numPowersOf2 = scan.nextInt();
                    
            System.out.println("Here are the first " + numPowersOf2 + " powers of 2");
            
            while (exponent <= numPowersOf2)
            {
                product = 1;
                for(int i = 0; i < exponent; i++) {
                    product = 2*product;
                }
                System.out.println("2^" + exponent + " = " + product);
                exponent++;
            }
        }
}
