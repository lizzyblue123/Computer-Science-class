import java.util.Scanner;

public class heartBeatInWholeLife{

public static void main(String args[]){

Scanner scnr = new Scanner(System.in);

int age = 0;
int year = 0;
int days = 0;
int hours = 0;
int min = 72;
int amountOfHeartbeats = 0;

//the heart beats at 72 beats per minute

System.out.println("Enter your age: ");
age = scnr.nextInt();

hours = min * 60;
days = hours * 24;
year = days * 365;
amountOfHeartbeats = year * age;

System.out.println("Your heart has beat: " + amountOfHeartbeats + " times in your whole life.");



   }
}