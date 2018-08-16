package InstanceExam;

public class TestTv {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 1;
		t.volume = 0;
		
		t.volumeUp();
		t.volumeDown();
		t.channelUp();
		t.channelDown();
	}
}
