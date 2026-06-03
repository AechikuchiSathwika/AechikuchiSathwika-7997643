class PatternSwitch{
	static void checktype(Object obj){
		switch(obj){
			case Integer i ->
			System.out.println(i + " " + "is an Integer");
			case String s ->
			System.out.println(s + " " + "is a string");
			case Double d ->
			System.out.println(d + " " + "is a double value");
			case null ->
			System.out.println("Given object is null!");
			default ->
			System.out.println("Unknown object");
		}
	}
	public static void main(String args[]){
		checktype(19);
		checktype("Sathwika");
		checktype(9.99);
		checktype(null);
		checktype(true);
	}
}