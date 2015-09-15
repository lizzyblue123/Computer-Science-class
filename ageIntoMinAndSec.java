import java.util.scanner

   public class ageIntoMinAndSec{
   
   public static void main(String args[]){
   
   Scanner liz = new Scanner(System.in);
   
   int age = 0;
   int days = 0;
   int hours = 0;
   int minutes = 0;
   int seconds = 0;
   
   System.out.println("Enter your age: ");
   age = liz.nextInt();
   
   days = age * 365;
   hours = days * 24;
   seconds = hours * 3600;
   minutes = seconds / 60;
   seconds = seconds % 60;
   
   System.out.println("You have been alive for: " + minutes +" minutes and " + seconds + "seconds");
   
   
   