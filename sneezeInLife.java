import java.util.Scanner;

public class sneezeInLife{

public static void main(String args[]){

int day = 4; //on average people sneeze about 4 times per day
int year = 0;
int age = 0;
int sneezesInLife = 0;

Scanner scnr = new Scanner(System.in);

System.out.println("Enter your age: ");
age = scnr.nextInt();

year = day * 365;
sneezesInLife = year * age;

System.out.println("You have sneezed: " + sneezesInLife + " times in your entire life.");


   }
}