import java.util.*;
import java.util.stream.*;
class records{
	record Person(String name, int age){}
	public static void main(String args[]){
		Person p1 = new Person("Sathwika",20);
		Person p2 = new Person("Rudra",12);
		Person p3 = new Person("Sahithi",14);
		Person p4 = new Person("Surya",25);
		Person p5 = new Person("Akshitha",21);
		System.out.println("Records: ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		List<Person> adults = list.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());
		System.out.println();
		System.out.println("Adults: ");
		for(Person p: adults){
			System.out.println(p);
		}
	}
}