package ObjectClassExam;

/*
 * Object Class 에서의 유용한 메서드
 * 	1. protected Object clone() : 객체 자신의 복사본 반환
 * 	2. public boolean equals(Object x) : 객체 자신과 매개변수의 x의 객체가 같은 객체인지 판단 ==> 사실상 같은 참조변수를 가지고 있는지 비교(객체 내부의 값이 같은지 비교하는 것이 아님)
 *  3. protected void finalize() : 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출. 수행 되어야 할 작업이 있으면 이 메서드를 오버라이딩 한다.
 *  4. public Class getClass() : 객체 자신의 클래스 객체 반납
 *  5. public int hashCode()  : 객체 자신의 해시코드 반납
 *  6. public String to String() : 객체 자신의 정보를 문자열로 반환
 *  7. public void notify() : 객체 자신을 사용하려고 기다리는 쓰레드 하나 깨움
 *  8. public void notifyAll() : 객체 자신을 사용하려는 모든 쓰레드를 깨움
 *  9. public void wait(), wait(long timeout), wait(long timeout, int nanos) : 현재 쓰레드 호출 전까지 기다리게 함 (무제한, 1/1000 초, 1/10의 9제곱 초)
 * 
 */
class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}

public class EqualsMethodExam {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}

		v2 = v1; // 두 객체의 참조 변수를 갖은 값으로 만들어줌.

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		//그런데 이렇게 되면 객체 내부의 값이 같은지는 알 수가 없음.
		// ==> 주소가 아닌 값 자체를 비교하도록 오버라이딩 하자!
		
		Person p1 = new Person(10, "김호규", 175.0, 68.2);
		Person p2 = new Person(10, "김호진", 175.0, 68.2);
		//이름이 다르기 때문에 다른 사람이라고 출력
		if(p1.equals(p2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		//이름을 같게 바꿔줌
		p2.name = "김호규";
		//같은 사람이라고 출력됨.
		if(p1.equals(p2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		
	}
}
class Person{
	int age;
	String name;
	double height;
	double weight;
	public Person(int age, String name, double height, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) { //같은지 비교 전에는 null이 아닌 것과 해당 객체의 타입이 맞는지 부터 체크!
			return this.age == ((Person)obj).age && this.name == ((Person)obj).name
					&& this.height == ((Person)obj).height && this.weight == ((Person)obj).weight;
		}else {
			return false;
		}
	}
}


















