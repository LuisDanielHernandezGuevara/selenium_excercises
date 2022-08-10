package Introduction.excercise;

public class ConstructorDemo {
	String test1 = "Test";
	String a ="Letter a";
	

	public ConstructorDemo() {
		int a =16;
		System.out.println("Constructor");
		System.out.println(this.a);
		System.out.println(a);

	}
	
	public ConstructorDemo(int param1 , int param2) {
		System.out.println("Param constuctor");
		int c= param1 + param2;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cD = new ConstructorDemo();
		ConstructorDemo cDP = new ConstructorDemo(2,3);
		
		
		ConstructorChild cC = new ConstructorChild();
		cC.getData();

	}
	
}
