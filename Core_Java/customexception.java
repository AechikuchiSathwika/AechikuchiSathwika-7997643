import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
class customexception{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try{
			if(age<18){
				throw new InvalidAgeException("Age must be 18 or above!");
			}
			System.out.println("Eligible to vote!");
		}
		catch(InvalidAgeException e){
			System.out.println("Exception: " + e.getMessage());
		}
	}
}