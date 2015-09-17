import java.util.Scanner;

public class caloriesBurned{

public static void main(String args[]){

int day = 1800; //the average person burns about 1600 to 2100 calories just doing routine things without added excersize
int year = 0;
int age = 0;
int calorieBurned = 0;
int caloriesOfSandwich = 352; //average number of calories in a sandwich
int sandwichesNeededToBeEaten = 0;

Scanner scnr = new Scanner(System.in);

System.out.println("Enter your age: ");
age = scnr.nextInt();

year = day * 365;
calorieBurned = year * age;

System.out.println("You have burned about: " + calorieBurned + " in your entire life without any added excersize.");

sandwichesNeededToBeEaten = calorieBurned / caloriesOfSandwich;

System.out.println("You would need to eat about: " + sandwichesNeededToBeEaten + " sandwiches in order to equal that many calories.");

   }
}