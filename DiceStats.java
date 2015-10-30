import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String args []) {
     
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      
      int i = 0;
      int numRolls = 0;
      int numTwos = 0;
      int numThrees = 0;
      int numFours = 0;
      int numFives = 0;
      int numSixes = 0;
      int numSevens = 0;
      int numEights = 0;
      int numNines = 0;
      int numTens = 0;
      int numElevens = 0;
      int numTwelves = 0;
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
            
            if (rollTotal == 2) {
               numTwos = numTwos + 1;
            }
            else if (rollTotal == 3) {
               numThrees = numThrees + 1;
            }
            else if (rollTotal == 4) {
               numFours = numFours + 1;
            }
            else if (rollTotal == 5) {
               numFives = numFives + 1;
            } 
            else if(rollTotal == 6) {
               numSixes = numSixes + 1;
            }
            else if (rollTotal == 7) {
               numSevens = numSevens + 1;
            }
            else if (rollTotal == 8) {
               numEights = numEights + 1;
            }
            else if (rollTotal == 9) {
               numNines = numNines + 1;
            }
            else if (rollTotal == 10) {
               numTens = numTens + 1;
            }
            else if (rollTotal == 11) {
               numElevens = numElevens + 1;
            }
            else if (rollTotal == 12) {
               numTwelves = numTwelves + 1;
            }
       }
       
       System.out.println("\nDice roll statistics:");
       System.out.println("2s: " + numTwos);
       System.out.println("3s: " + numThrees);
       System.out.println("4s: " + numFours);
       System.out.println("5s: " + numFives);
       System.out.println("6s: " + numSixes);
       System.out.println("7s: " + numSevens);
       System.out.println("8s: " + numEights);
       System.out.println("9s: " + numNines);
       System.out.println("10s: " + numTens);
       System.out.println("11s: " + numElevens);
       System.out.println("12s: " + numTwelves);
     }
     
     else {
      while (numRolls < 1) {
       System.out.println("Invalid rolls. Try again.");
       System.out.println ("Enter number of rolls: ");
       numRolls = scnr.nextInt();
      }
     }
      System.out.print("2:  ");
      
      for (i = 0; i < numTwos; i++){
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("3:  ");
      
      for (i = 0; i < numThrees; i++){
         System.out.print("*");
      }
      System.out.println();
      
      System.out.print("4:  ");
      
      for (i = 0; i < numFours; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("5:  ");
      
      for (i = 0; i < numFives; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("6:  ");
      
      for (i = 0; i < numSixes; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("7:  ");
      
      for (i = 0; i < numSevens; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("8:  ");
      
      for (i = 0; i < numEights; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("9:  ");
      
      for (i = 0; i < numNines; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("10: ");
      
      for (i = 0; i < numTens; i++){
         System.out.print("*");
      }
      System.out.println();
      
       System.out.print("11: ");
      
      for (i = 0; i < numElevens; i++){
         System.out.print("*");
      }
      System.out.println();

       System.out.print("12: ");
      
      for (i = 0; i < numTwelves; i++){
         System.out.print("*");
      }
      System.out.println();



   }
}