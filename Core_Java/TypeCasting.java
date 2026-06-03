class TypeCasting{
		public static void main(String args[]){
			
			double d = 9.89;
			int i = (int)d;          //explicit TC
			System.out.println("Double value: " + d);
			System.out.println("After explicit type casting: " + i);
			int x = 10;
			double y = x;            //implicit type casting
			System.out.println("Integer value: " + x);
			System.out.println("After implicit type casting: " + y);
		}
}