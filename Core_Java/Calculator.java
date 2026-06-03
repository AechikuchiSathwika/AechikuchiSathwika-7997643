import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a , b;
		char c;
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Choose an operation: ");
		c = sc.next().charAt(0);
		switch(c){
			case '+':
			System.out.println(a+b);
			break;
			case '-':
			System.out.println(a - b);
			break;
			case '*':
			System.out.println(a * b);
			break;
			case '/':
			System.out.println(a/b);
			break;
			case '%':
			System.out.println(a%b);
			break;
			default:
			System.out.println("Error! Choose correct operation");
		}
	}
}