import java.util.Scanner;

public class timeLab{

public static void main(String args[]){

int secondsBeforeConversion = 0;
int min = 0;
int hour = 0;
int sec = 0;

Scanner scnr = new Scanner(System.in);

System.out.println("Enter an amount of seconds: ");
secondsBeforeConversion = scnr.nextInt();

min = secondsBeforeConversion / 60;
sec = secondsBeforeConversion % 60;
hour = min / 60;
min = min % 60;

System.out.println(secondsBeforeConversion + " seconds is equal to " + hour + " hour(s), " + min + " minute(s), and " + sec + " second(s).");

   }
}