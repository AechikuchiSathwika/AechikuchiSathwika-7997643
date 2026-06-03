class car{
	String make;
	String model;
	int year;
	void display(){
		System.out.println("Car make: " + make);
		System.out.println("Car model: " + model);
		System.out.println("Manufacturing year: " + year);
	}
	public static void main(String args[]){
		car c1 = new car();
		c1.make = "Hyundai";
		c1.model = "Creta";
		c1.year = 2023;
		car c2 = new car();
		c2.make = "Audi";
		c2.model = "A6";
		c2.year = 2022;
		c1.display();
		c2.display();
	}
}