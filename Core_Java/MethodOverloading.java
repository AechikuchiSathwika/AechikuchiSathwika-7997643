class MethodOverloading{
	int add(int a, int b){
		return a + b;
	}
	double add(double a, double b){
		return a + b;
	}
	int add(int a, int b, int c){
		return a + b + c;
	}
	public static void main(String args[]){
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.add(10,20));
		System.out.println(m.add(3.33,6.78));
		System.out.println(m.add(2,3,4));
	}
}