package Java.learning.sumu;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Constructor");
	}

	public static void method1(){
		System.out.println( "Inside static method");
	}
	
	public void method2(){
		System.out.println("inside non-static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Constructor con = new Constructor();
		method1();
		con.method2();
	}

	
}
