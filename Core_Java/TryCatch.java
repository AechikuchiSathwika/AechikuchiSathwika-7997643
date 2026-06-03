import java.util.*;
class TryCatch{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		try{
			int res = a/b;
			System.out.println("Result: " + res);
		}
		catch(ArithmeticException e){
			System.out.println("Error! Division by zero is not possible.");
		}
	}
}