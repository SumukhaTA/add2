package Java.learning.sumu;

public class StringOperation {

	public void stringcharAt(){
		String name = "Nanna Hesaru Sumukha";
		char character = name.charAt(4);
		System.out.println(character);
	}
	
	public static void main(String[] args) {
		StringOperation so = new StringOperation();
		so.stringcharAt();
	}

	
}
