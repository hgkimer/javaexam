package ExceptionExam;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			if(e instanceof ArithmeticException) {
				System.out.println("true");
				
			}
			System.out.println("ArithmeticException");
			
		} catch(Exception ae) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
