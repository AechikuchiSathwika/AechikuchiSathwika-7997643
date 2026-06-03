import java.util.*;
class lambdaexpression{
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("Sathwika");
		list.add("Akshitha");
		list.add("Sahithi");
		list.add("Rudra");
		list.add("Surya");
		Collections.sort(list, (a,b)-> a.compareTo(b));
		System.out.println("Sorted list: ");
		for(String name: list){
			System.out.println(name);
		}
	}
}