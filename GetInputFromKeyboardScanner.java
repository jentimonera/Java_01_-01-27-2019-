import java.util.Scanner;

public class GetInputFromKeyboardScanner {
	public static void main(String[] args) {
		String name = " ";
		System.out.print("Enter Name: ");
		Scanner reader = new Scanner (System.in);
		name = reader.nextLine();
		reader.close();
		System.out.println ("Hello " + name + "!");
	}
}