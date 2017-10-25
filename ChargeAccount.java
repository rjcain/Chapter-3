import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Write a description of class ChargeAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChargeAccount
{
    
    double prevBal;
    double addCharges;
    double interest;
    double newBal;
    double minPayment;
    
    Scanner scan = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    
    public void inputCustomerInfo() {
        System.out.print("Previous Balance: $");
        prevBal = scan.nextDouble();
        System.out.print("Additional Charges: $");
        addCharges = scan.nextDouble();
        System.out.println();
    }
    
    public void printCustomerInfo() {
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Previous Balance:\t" + money.format(prevBal));
        System.out.println("Additional Charges:\t" + money.format(addCharges));
        if(prevBal > 0) {
            interest = 0.02 * (prevBal + addCharges);
            interest = ((int) (interest * 100))/100.00;
        }
        else {
            interest = 0;
        }
        System.out.println("Interest:\t\t" + money.format(interest));
    }
    
    public void printNewBal() {
        newBal = prevBal + addCharges + interest;
        System.out.println();
        System.out.println("New Balance:\t\t" + money.format(newBal));
        System.out.println();
    }
    
    public void printPayment() {
        if(newBal < 50) {
            minPayment = newBal;
        }
        else if(newBal >= 50 && newBal <= 300) {
            minPayment = 50.00;
        }
        else {
            minPayment = 0.2 * newBal;
        }
        System.out.print("Minimum Payment:\t" + money.format(minPayment));
    }
}
