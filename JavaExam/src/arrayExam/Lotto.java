package arrayExam;

public class Lotto {
	public static void main(String[] args) {
		/*
		 * 로또 번호 생성하기
		 */
		int[] lotto = new int[45];
		for(int i = 0; i < lotto.length; i++) {
		 lotto[i] = i+1;
		}
		for(int i = 0; i < 6; i++) {
			int temp = 0;
			int j = 0;
			j = (int)(45*Math.random());
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
		for(int i=0; i < 6; i++) {
			for(int j = i+1; j < 6; j++) {
				int temp = 0;
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d\t", lotto[i]);
		}
	}
		
}
