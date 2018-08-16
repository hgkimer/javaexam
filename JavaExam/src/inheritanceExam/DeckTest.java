package inheritanceExam;
//카드 덱 클래스
class Deck{
	final int CARD_NUM = 52;//카드의 총 개수
	//카드 객체가 들어갈 카드 타입의 배열을 지정된 카드의 개수만큼의 크기로 생성
	Card cardArr[] = new Card[CARD_NUM];
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0; k--) {
			//카드의 종류인 4부터 1까지 반복
			//반복문을 돌릴 때 1부터 시작하면 최대부터 거꾸로 가는 것 생각해 보기!
			for(int n = 0; n < Card.NUM_MAX; n++) {
				//카드의 종류 하나당 최대 숫자만큼 생성하여 카드 배열에 저장한다.
				cardArr[i++] = new Card(k, n+1);
			}
		}
	}
	//지정된 위치의 카드를 리턴
	Card pick(int index) {
		return cardArr[index];
	}
	//카드덱에서 임의의 순서의 카드 하나를 리턴
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			//52개중 임의의 카드 하나
			
			Card temp = cardArr[i];
			//i번째의 카드를 임시 저장공간에
			cardArr[i] = cardArr[r];
			//임의의 카드를 i번째 카드로 바꿈
			cardArr[r] = temp;
			//원래 i번째였던 카드를 r번째로 바꿈
		}
	}
}//end of Deck
class Card{
	static final int KIND_MAX = 4;
	//카드 무늬의 수
	static final int NUM_MAX = 13;
	//카드 무늬별 갯수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card(){
		//스페이드면서 카드 숫자가 1인 첫 번째 카드를 만들기 위한 생성자
		this(SPADE, 1);
	}
	Card(int kind, int number){
		//위의 생성자를 정의하기 위한 생성자
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		//선택된 카드 종류 숫자에 맞춰서 해당 종류를 배열에 저장
		//배열의 index와 카드 종류의 숫자를 맞추어 준다.(그래서 첫 번째 인덱스에 ""가 들어간 것)
		String numbers = "0123456789XJQK";
		
		return "kind : " + kinds[this.kind]
				+"	number : " + numbers.charAt(number);
	}
}
public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();//새로운 카드 덱 생성
		Card c = d.pick(0); //첫 번째 카드 선택하여 변수에 저장
		System.out.println(c);//첫 번째 카드 정보 출력
		d.shuffle();//카드 섞기
		c = d.pick(0);//섞인 카드중 첫 번째 카드 저장
		System.out.println(c);//카드 정보 출력
	}
}//end of DeckTest
