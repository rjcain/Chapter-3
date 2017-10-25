
public class Table {
   public static void main(String args[]) {
       int x = 1;
       int y = 1;
       for(int u = 0; u < 12; u++) {
           for(int i = 0; i < 12; i++) {
               System.out.print(" ");
               if(x*y < 10) {
                   System.out.print(" " + x*y + " ");
               }
               if(x*y >= 10 && x*y < 100) {
                   System.out.print(" " + x*y);
                }
               if(x*y >= 100) {
                   System.out.print(x*y);
                }
               x++;
            }
           x=1;
           y++;
           System.out.println();
       }
    }
}
