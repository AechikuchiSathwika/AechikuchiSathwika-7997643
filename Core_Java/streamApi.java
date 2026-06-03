import java.util.*;
import java.util.stream.*;
class streamApi{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(19);
		list.add(5);
		list.add(84);
		list.add(162);
		list.add(3);
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers: ");
		for(int i:even){
			System.out.println(i);
		}
	}
}