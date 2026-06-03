import java.util.*;
class Arraylistex{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter name of the student");
			String name = sc.nextLine();
			list.add(name);
		}
		System.out.println("Student names: ");
		for(String s: list){
			System.out.println(s);
		}
	}
}