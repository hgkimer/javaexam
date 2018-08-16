package inheritanceExam;


class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest{
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		System.out.println(ctv.power);
		ctv.power();
		//자손 클래스인 CaptionTv 객체를 이용하여 부모 클래스의 멤버에 접근할 수 있다.
		System.out.println(ctv.power);
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}
}
