package ObjectClassExam;
/*
 * hashCode() ==> 해싱기법에 사용되는 해시함수를 구현한 것
 * 해싱 기법 : 기억장치(메모리) 관리기법중 하나, 데이터를 검색하거나 저장하는데 유용함 해시함수를 사용하여 데이터에 접근, 
 * 		해시코드 값에 어떤 연산(해싱 함수)을 시행하여 이 코드값이 있는 기억 장소의 주소로 바로 접근하는 방법으로 직접 파일 구성에 이용
 * 해싱 함수 : 메모리주소를 해시 코드로 변환한다.
 * Object 클래스에 정의된 hashCode() : 객체의 주소값을 이용해 해시코드를 생성한다. --> String을 제외(String은 문자열이 같으면 같은 해시코드를 리턴하도록 오버라이딩 되어있음)한 
 * 								객체의 주소값은 모두 다르기 때문에 객체들의 해시코드도 모두 다르다.
 * 								==> 앞선 예제에서 객체의 내용을 가지고 동일 여부를 따지려면 hashCode() 함수도 오버라이딩 해서 같게끔 해주어야 함.
 * 
 */
public class HashCodeExam {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스는 문자열이 같으면 같은 해시 코드를 반환하도록 hashCode()메서드를 오버라이딩 함.
		System.out.println(System.identityHashCode(str1)); //System.identityHashCode(Object x)  객체의 주소값으로 해시코드를 생성하는 메서드
		System.out.println(System.identityHashCode(str2));
	}
}
 