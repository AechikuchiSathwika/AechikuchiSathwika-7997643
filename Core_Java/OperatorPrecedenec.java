class OperatorPrecedence{
	public static void main(String args[]){
		int a = 10 + 5 * 2;
		int b = (10 + 5) * 2;
		int c = 20 - 4 * 3 + 6 / 2;
		int d = 100 / 10 * 5 + 3;
		System.out.println("10 + 5 * 2 = " + a);
		System.out.println("(10 + 5) * 2 = " + b);
		System.out.println("20 - 4 * 3 + 6 / 2 = " + c);
		System.out.println("100 / 10 * 5 + 3 = " + d);
	}
}