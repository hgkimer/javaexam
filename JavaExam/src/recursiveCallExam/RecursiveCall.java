package recursiveCallExam;


public class RecursiveCall {
	/*
	 * 팩토리얼 연습
	 */
	public static long factorial(int n) {
		long result = 0;
		if(n == 1) {
			result = 1;
		}else {
			result = n* factorial(n-1);
		} 
		return result;
	}
	public static void main(String[] args) {
		long n = RecursiveCall.factorial(10);
		System.out.println(n);
	}
}
