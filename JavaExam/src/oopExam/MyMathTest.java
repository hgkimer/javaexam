package oopExam;

public class MyMathTest {
	public static void main(String[] args) {
		
		//객체 생성 없이 사용이 가능한 static 메소드(클래스 메소드)
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.substract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.devide(200.0, 100.0));
		
		//객체 생성이 필요한 인스턴스 메소드
		MyMath m = new MyMath();
		m.a = 200L;
		m.b = 100L;
		System.out.println(m.add());
		System.out.println(m.substract());
		System.out.println(m.multiply());
		System.out.println(m.devide());
		
	}
}
