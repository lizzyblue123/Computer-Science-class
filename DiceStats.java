import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String args[]) {
     
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      
      int NUM_ELEMENTS = 13;
      int[] numAdded = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      int i = 0;
      int numRolls = 0;
      int die1 = 0;
      int die2 = 0;
      int rollTotal = 0;
      boolean lessThanOne = false;
      
     
         System.out.println("Enter number of rolls: ");
         numRolls = scnr.nextInt();

      while (numRolls < 1) {
       System.out.println("Invalid rolls. Try again.");
       System.out.println ("Enter number of rolls: ");
       numRolls = scnr.nextInt();
      }

         
      if(numRolls >= 1) {
         for(i = 0; i <= numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            rollTotal = die1 + die2;
            
            for (i = 2; i < NUM_ELEMENTS; i++) {
            	if (rollTotal == i) {
            		numAdded[i] = numAdded[i] + 1;
            	}
            }
       }
       
       System.out.println("\nDice roll statistics:");
       for (i = 2; i < 13; i++) {
         System.out.println(i + "s: " + numAdded[i]);
      
       }
     }
     
     else {
      while (numRolls < 1) {
       System.out.println("Invalid rolls. Try again.");
       System.out.println ("Enter number of rolls: ");
       numRolls = scnr.nextInt();
      }
     }
      System.out.print("2:  ");
      
      for (i = 0; i < numAdded[2]; i++){
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("3:  ");
      
      for (i = 0; i < numAdded[3]; i++){
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("4:  ");
      
      for (i = 0; i < numAdded[4]; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("5:  ");
      
      for (i = 0; i < numAdded[5]; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("6:  ");
      
      for (i = 0; i < numAdded[6]; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("7:  ");
      
      for (i = 0; i < numAdded[7]; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("8:  ");
      
      for (i = 0; i < numAdded[8]; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("9:  ");
      
      for (i = 0; i < numAdded[9]; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("10: ");
      
      for (i = 0; i < numAdded[10]; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("11: ");
      
      for (i = 0; i < numAdded[11]; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("12: ");
      
      for (i = 0; i < numAdded[12]; i++){
         System.out.print("*");
      }
      System.out.println();



   }
}