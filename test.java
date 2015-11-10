public class test {

   public static void main(String args[]) {
      int max = 3; 
      for (int line = 1; line <= max; line++) {
         for (int m = 1; m <= line-1; m++){
            System.out.print(" ");
            for (int s = 1; s <= (11-2*line); s++){
               System.out.print("*");
               }
            System.out.println();
         }
     }
   }
}  