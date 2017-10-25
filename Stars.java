
public class Stars
{
    public void a() {
        for(int i = 10; i > 0; i--) {
            printItem("*", i);
            printItem(" ",-i +10);
            System.out.println();
        }
        System.out.println();
    }
    
    public void b() {
        for(int i = 0; i <= 10; i++) {
            printItem(" ",10-i);
            printItem("*",i);
            System.out.println();
        }
        System.out.println();
    }
    
    public void c() {
        for(int i = 0; i < 10; i++) {
            printItem(" ",i);
            printItem("*",10-i);
            System.out.println();
        }
        System.out.println();
    }
    
    public void d() {
        int numStars = 1;
        for(int i = 4; i >= 0; i--) {
            printItem(" ",i);
            printItem("*", numStars);
            printItem(" ",i);
            numStars++;
            numStars++;
            System.out.println();
        }
        numStars = 9;
        for(int i = 0; i <= 4; i++) {
            printItem(" ",i);
            printItem("*", numStars);
            printItem(" ",i);
            numStars--;
            numStars--;
            System.out.println();
        }
        System.out.println();
    }
    
    public static void printItem(String st, int num) {
        for(int i = 0; i < num; i++) {
            System.out.print(st);
        }
    }
}
