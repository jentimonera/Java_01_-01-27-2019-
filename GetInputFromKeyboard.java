import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
	
	public static void main ( String [] args){
		BufferedReader dataIn = new BufferedReader(new
			InputStreamReader ( System.in) );

		String name = " ";
		String surname = " ";
		System.out.print("Please enter Your Name:");
		try {
			name = dataIn.readLine ();
		System.out.print("Please enter Your Surame:");
			surname =dataIn.readLine ();
		}catch( IOException e){
			System.out.println ("Error!");
		}
		System.out.println("Hello " + name + " " + surname + "!");
	}
}