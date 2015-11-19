//start class (object class cannot have public before it says "class", else it will want you to name the file this)
class DragonBall{
   
   private int size;
   private int stars;
   private String color;

   public DragonBall(){
      size = 8;
      stars = 4;
      color = "orange";
   }
   public DragonBall(int s, int sT, String c){
      size = s;
      stars = sT;
      color = c;
   }
   public DragonBall(int sT, String c){
      stars = sT;
      color = c;
   }
   public void changeSize(int s){
      size = s;
   }
   public void changeStars(int sT){
      stars = sT;
   }
   public void changeColor(String c){
      color = c;
   }
   public int getSize() {
      return size;
   }
   public int getStars() {
      return stars;
   }
   public String getColor() {
      return color;
   }
   public String toString() {
      return "size: " + size + "\nstars: " + stars + "\ncolor: " + color; //prints the actual strings instead of the place stored in memory
   }
}// end of class

//start of new main class
public class DragonBallDriver { //main class so this will be public, this is what you name the program
	public static void main(String args[]) {
		
      DragonBall Goku = new DragonBall();
		DragonBall Kill = new DragonBall(12, 7, "chartreuse");
		DragonBall Nutella  = new DragonBall(5, "Green");
		
		System.out.println("Goku: ");
      System.out.println(Goku);
      System.out.println();
		System.out.println("Kill: ");
      System.out.println(Kill);
      System.out.println();
		System.out.println("Nutella: ");
      System.out.println(Nutella);
      System.out.println();
		
		Goku.changeSize(4);
		Kill.changeStars(7);
		Nutella.changeColor("Brown");
      System.out.println("New changes: ");
      System.out.println();
      
		
		System.out.println("Goku: ");
      System.out.println(Goku);
      System.out.println();
		System.out.println("Kill: ");
      System.out.println(Kill);
      System.out.println();
		System.out.println("Nutella: ");
      System.out.println(Nutella);
      System.out.println();    
	}
}