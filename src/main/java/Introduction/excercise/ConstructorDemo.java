package Introduction.excercise;

public class ConstructorDemo {
	String test1 = "Test";
	String a ="Letter a";
	

	public ConstructorDemo() {
		int a =16;
		final String Test = "Test String"; // Final is used to declares constants
		System.out.println("Constructor");
		System.out.println(this.a);//Scope is global returns Letter a
		System.out.println(a); // scope is function returns 16
		
	}
	
	public ConstructorDemo(int param1 , int param2) {
		System.out.println("Param constuctor");
		int c= param1 + param2;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONSTRUCTOR WHEN IS DECLARED RETURNS THE VALUE DECLARED WITHOUT CALL A METHOD 
		//WE CAN HAVE MORE THAN ONE CONSTRUCTOR
		//A CONSTRUCTOR CAN HAVE OR NOT PARAMS
		
		ConstructorDemo cD = new ConstructorDemo();
		ConstructorDemo cDP = new ConstructorDemo(2,3);
		
		
		ConstructorChild cC = new ConstructorChild();
		cC.getData();

	}
	
}
