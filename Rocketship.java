import java.util.Scanner;

public class Rocketship {
   public static void main(String args[]){
   
   int size = 0;
   int lines;
   int spaces;
   int dots;
   int fslashes;
   int bslashes;
   int stars;
   int i;
   int j = 0;
   int starequ;
   
   Scanner scnr = new Scanner(System.in);
   
   System.out.println("Enter size factor of rocketship: ");
   size = scnr.nextInt();
   
   lines = (2 * size) - 1;
   
   for (i = 1; i <= lines; i++) {
      for (spaces = 1; spaces <= lines - j; spaces++){
            System.out.print(" ");
      }
      for (fslashes = 1; fslashes <= i; fslashes++) {
          System.out.print("/");
      }
      System.out.print("**");
      for (bslashes = 1; bslashes <= i; bslashes++){
           System.out.print("\\");
      }
      System.out.println();
      j++;
   }
   System.out.print("+");
   for (starequ = 1; starequ <= size * 2; starequ++) {
      System.out.print("*=");
   }
   System.out.println("+");
   
   for (i = 1; i <= size; i++) {
      System.out.print("|");
      for (int fdots = size - i; fdots >= 0; fdots--) {
         System.out.print(".");
      }
      for (int tents = 1; tents <= i; tents++) {
         System.out.print("/\\");
      }
      for (int mdots = (size - i) * 2; mdots >= 0; mdots--) {
         System.out.print(".");
      }
      for (int tents = 1; tents <= i; tents++) {
         System.out.print("/\\");
      }
      for (int fdots = size - i; fdots >= 0; fdots--) {
         System.out.print(".");
      }
      System.out.println("|");
      
      
   }
   
   
  
   
   
   
   
      }
   }