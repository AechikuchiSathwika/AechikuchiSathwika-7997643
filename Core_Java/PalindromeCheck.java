import java.util.*;
class PalindromeCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = str.replaceAll("^a-zA-Z0-9","").toLowerCase();
		String rev = "";
		int n = str.length();
		for(int i = n - 1;i >= 0;i--){
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Plaindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}