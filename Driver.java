/**
 *Driver of Salary class
 */
public class Driver
{
    public static void main(String[] args) {
        Salary employee = new Salary();
        employee.setSalary();
        employee.setRating();
        employee.computeRaise();
        employee.printResults();
    }
}
