import java.util.*;
class NumberGuessing{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		int guess = 0;
		System.out.println("Guess the number from 1 to 100 : ");
		while(guess != num){
			System.out.println("Enter your guess: ");
			guess = sc.nextInt();
			if(guess > num){
				System.out.println("Too high!");
			}
			else if(guess < num){
				System.out.println("Too low!");
			}
			else{
				System.out.println("Correct! You guessed it.");
			}
		}
	}
}