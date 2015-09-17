import java.util.Scanner;

public class blinksInLifetime{

public static void main(String args[]){

int min = 17;
int hours = 0;
int days = 0;
int year = 0;
int age = 0;
int blinksInLifetime = 0;

//the average person blinks 15-20 times per minute, therefore we choose 17 as the number per minute

Scanner scnr = new Scanner(System.in);


System.out.println("Enter your age: ");
age = scnr.nextInt();

hours = min * 60;
days = hours * 16; //people are only awake for about 16 hours per day
year = days * 365;
blinksInLifetime = year * age;

System.out.println("You have blinked: " + blinksInLifetime + " times in your whole life.");


   }
}