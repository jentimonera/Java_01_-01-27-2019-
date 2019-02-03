public class UsingIfExample1 {

		public static void main(String[] args) {

	int grade = 100;
	if ( grade > 90 ) {
		System.out.println ("Very good!");
	}
		
	else if(grade >60){
		System.out.println ("Good job!");
	}
	
	else {
		System.out.println("Sorry you failed");
	}
	}
}