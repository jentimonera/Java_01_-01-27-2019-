import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int maxSize = 5;
		String[] name = new String [maxSize];
		Scanner sc = new Scanner (System.in);

		for (int i=0; i < maxSize; i++) {
			System.out.println("Please enter a name: ");
			name [i] = sc.nextLine();
		}
		System.out.println("Hello " + name [0] + "!");
		System.out.println("Hello " + name [1] + "!");
		System.out.println("Hello " + name [2] + "!");
		System.out.println("Hello " + name [3] + "!");
		System.out.println("Hello " + name [4] + "!");
	}
}