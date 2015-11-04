import java.util.Scanner;

public class Rocketship {
	public static void main(String args[]) {
		
		Scanner scnr = new Scanner(System.in);
		
		int i; 
		int space;
		int lines;
		int size;
		int fslash;
		int bslash;
		int j = 0;
		
		System.out.println("Enter the size of your rocketship: ");
		size = scnr.nextInt();
		
		lines = (2 * size) - 1;
		
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
		System.out.print("+");
		for (i = 1; i <= size * 2; i++) {
			System.out.print("=*");
		}
		System.out.println("+");
		
		int dot = 0;
		int tent = 0;
		j = 1;
		
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
		System.out.print("+");
		for (i = 1; i <= size * 2; i++) {
			System.out.print("=*");
		}
		System.out.println("+");
		
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
		System.out.print("+");
		for (i = 1; i <= size * 2; i++) {
			System.out.print("=*");
		}
		System.out.println("+");
		
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
		
	}

}
