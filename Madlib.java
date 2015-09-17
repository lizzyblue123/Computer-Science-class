import java.util.Scanner;

public class Madlib{
   public static void main(String args[]){
   
   Scanner scnr = new Scanner(System.in);
  
   String wordRelative = "";
   String wordAdjective = "";
   String wordAdjective1 = "";
   String wordAdjective2 = "";
   String wordNameOfPersonInRoom = "";
   String wordAdjective3 = "";
   String wordAdjective4 = "";
   String wordVerbEndingInED = "";
   String wordBodyPart = "";
   String wordVerbEndingInING = "";
   String wordNounPlural = "";
   String wordNoun = "";
   String wordAdverb = "";
   String wordVerb = "";
   String wordVerb1 = "";
   String wordRelative2 = "";
   String wordPersonInRoom = "";
   
   System.out.println("Enter a kind of Relative.");
   wordRelative = scnr.nextLine();
   
   System.out.println("Enter an Adjective.");
   wordAdjective = scnr.nextLine();
   
   System.out.println("Enter another Adjective.");
   wordAdjective1 = scnr.nextLine();
   
   System.out.println("Enter a different Adjective.");
   wordAdjective2 = scnr.nextLine();
   
   System.out.println("Enter the name of a person in the room.");
   wordNameOfPersonInRoom = scnr.nextLine();
   
   System.out.println("Enter an Adjective.");
   wordAdjective3 = scnr.nextLine();
   
   System.out.println("Enter another Adjective.");
   wordAdjective4 = scnr.nextLine();
   
   System.out.println("Enter a Verb ending in ED.");
   wordVerbEndingInED = scnr.nextLine();
   
   System.out.println("Enter a Body Part.");
   wordBodyPart = scnr.nextLine();
   
   System.out.println("Enter a Verb ending in ING.");
   wordVerbEndingInING = scnr.nextLine();
   
   System.out.println("Enter a Plural Noun.");
   wordNounPlural = scnr.nextLine();
   
   System.out.println("Enter a Noun.");
   wordNoun = scnr.nextLine();
   
   System.out.println("Enter an Adverb.");
   wordAdverb = scnr.nextLine();
   
   System.out.println("Enter a Verb.");
   wordVerb = scnr.nextLine();
   
   System.out.println("Enter another Verb.");
   wordVerb1 = scnr.nextLine();
   
   System.out.println("Enter a Relative.");
   wordRelative2 = scnr.nextLine();
   
   System.out.println("Enter the name of a person in the room.");
   wordPersonInRoom = scnr.nextLine();
   
   System.out.println("Dear " + wordRelative);
   System.out.println("I'm having a(n) " + wordAdjective + " time at camp.");
   System.out.println("The counselour is " + wordAdjective1 + " and the food is " + wordAdjective2 + ".");
   System.out.println("I met " + wordNameOfPersonInRoom + " and we became " + wordAdjective3 + " friends.");
   System.out.println("Unfortunately, is " + wordAdjective4 + " and I " + wordVerbEndingInED + " my " + wordNounPlural + " so we couldn't go " + wordVerbEndingInING + " like everybody else.");
   System.out.println("I need more " + wordNoun + " and a " + wordAdverb + " sharpener, so please " + wordVerb + " " + wordVerb1 + " more when you get back.");
   System.out.println("Your " + wordRelative2);
   System.out.println(wordPersonInRoom);
   
      }
  }
