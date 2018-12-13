import java.util.Scanner;


public class Guessnumber {
	public Guessnumber() {}
	
	int randomnum() {
		double rand = Math.random();
		rand *= 100;
		int rand1 = (int) rand;
		return rand1;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberToGuess, userNumber;
		
		Guessnumber gn = new Guessnumber();
		
		numberToGuess = gn.randomnum();
		
		do {
		System.out.println("Enter the number you would like to check: from 0-99 ");
		userNumber = input.nextInt();
		if (userNumber == numberToGuess) {
			System.out.println("You guessed the correct number " + numberToGuess);
			break;
		}
		else if (userNumber < numberToGuess) {
			System.out.println("You guessed too low");
			
		}
		else if (userNumber > numberToGuess) {
			System.out.println("You guessed to high");
			
		}
		
		// Math.random();
		}while (userNumber != numberToGuess);
		
	}


}
