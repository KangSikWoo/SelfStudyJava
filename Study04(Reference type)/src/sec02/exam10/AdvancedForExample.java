package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { //향상된 for문, scores배열 길이만큼 실행
			sum += score;
		}
		System.out.println("점수 총합 : " + sum);

	}

}
