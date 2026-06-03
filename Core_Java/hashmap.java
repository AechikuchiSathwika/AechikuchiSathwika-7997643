import java.util.*;
class hashmap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> map = new HashMap<>();
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter student id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student name: ");
			String name = sc.nextLine();
			map.put(id,name);
		}
		System.out.println("Enter an Id to search: ");
		int searchid = sc.nextInt();
		if(map.containsKey(searchid)){
			System.out.println("Student name: " + map.get(searchid));
		}
		else{
			System.out.println("Id not found!!");
		}
	}
}