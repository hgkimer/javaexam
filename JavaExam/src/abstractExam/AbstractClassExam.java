package abstractExam;

abstract class Player{
	boolean pause;
	int currentPos;
	
	Player(){
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos); //추상메서드
	abstract void stop();
	
	void play() {
		play(currentPos); //선언된 추상 메서드를 호출할 수 있다.
	}
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}
class CDPlayer extends Player{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
	int currentTrack;
	
	void nextTrack() {
		currentTrack++;
	}
	void preTrack() {
		if(currentTrack >1) {
			currentTrack--;
		}
	}
	
}