package InstanceExam;

public class Tv {
	int channel;
	int volume;
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 "+channel+"번 채널입니다.");
	}
	public void channelDown() {
		this.channel--;
		System.out.println("현재 "+channel+"번 채널입니다.");
	}
	public void volumeUp() {
		this.volume++;
		System.out.println("현재 음량은 "+volume+"입니다.");
	}
	public void volumeDown() {
		this.volume--;
		System.out.println("현재 음량은 "+volume+"입니다.");
	}
	
}
