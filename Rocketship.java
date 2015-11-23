import java.util.Scanner;

public class Rocketship {
<<<<<<< HEAD
	
	public static void Cone(int size, int lines){
		int i;
		int j = 0;
		int fslash;
		int bslash;
		int space;
		
		for (i = 1; i <= lines; i++) {
			for (space = 1; space <= lines - j; space++) {
				System.out.print(" ");
			}
			for (fslash = 1; fslash <= i; fslash++) {
				System.out.print("/");
			}
			System.out.print("**");
			for (bslash = 1; bslash <= i; bslash++) {
				System.out.print("\\");
			}
			System.out.println();
			j++;
		}
		
		return;
	}
	
	public static void bodyOutline(int size){
		
		System.out.print("+");
		for (i = 1; i <= size * 2; i++) {
			System.out.print("=*");
		}
		System.out.println("+");
		
		return;
	}
	
	public static void topBody(int size) {
		
		int dot = 0;
		int tent = 0;
		
		for(i = 1; i <= size; i++) {
			System.out.print("|");
			for (dot = -i + size; dot > 0; dot--) {
				System.out.print(".");
			}
			for (tent = 1; tent <= i; tent++) {
				System.out.print("/\\");
			}
			for(dot = (-2 * i) + (2 * size); dot > 0; dot--) {
				System.out.print(".");
			}
			for (tent = 1; tent <= i; tent++) {
				System.out.print("/\\");
			}
			for (dot = -i + size; dot > 0; dot--) {
				System.out.print(".");
			}
			System.out.println("|");
			
		}
		
		return;
	}
	public static void bottomBody(int size) {
		
		int dot = 0;
		int tent = 0;
		
		for (i = 1; i <= size; i++){
			System.out.print("|");
			for(dot = 0; dot < i - 1; dot++){
				System.out.print(".");
			}
			for (tent = 1; tent <= -i + (size + 1); tent++){
				System.out.print("\\/");
			}
			for (dot = 0; dot < (i * 2) - 2; dot++) {
				System.out.print(".");
			}
			for (tent = 1; tent <= -i + (size + 1); tent++){
				System.out.print("\\/");
			}
			for(dot = 0; dot < i - 1; dot++){
				System.out.print(".");
			}
			System.out.println("|");
		}
		
		return;
	}
	public static void main(String args[]) {
		
		Scanner scnr = new Scanner(System.in);
		 
		int lines;
		int size;
		
		System.out.println("Enter the size of your rocketship: ");
		size = scnr.nextInt();
		
		lines = (2 * size) - 1;
		
		Cone(size, lines);
		bodyOutline(size);
		topBody(size);
		bottomBody(size);
		bodyOutline(size);
		bottomBody(size);
		topBody(size);
		bodyOutline(size);
		Cone(size, lines);
		
		
	}

}
=======
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
>>>>>>> origin/master
