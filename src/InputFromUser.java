import java.util.Scanner;

public class InputFromUser {
	 private Scanner reader = new Scanner(System.in);
	 
	 public int QuickSilverItemLevel(){
		 System.out.println("Enter QuickSilver ItemLevel.");
		 return reader.nextInt();
	 }
	 public String NameOfItem(){
		 System.out.println("Enter Name of Flask");
		 return reader.nextLine();
	 }
}
