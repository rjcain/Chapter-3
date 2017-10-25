
/**
 * Write a description of class CADriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CADriver
{
    public static void main(String args[]) {
        ChargeAccount account = new ChargeAccount();
        account.inputCustomerInfo();
        account.printCustomerInfo();
        account.printNewBal();
        account.printPayment();
    }
}
