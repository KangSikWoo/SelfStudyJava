package sec01.exam27;

public class MathRandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math.random의 원래 범위 : 0 <= Math.random < 1
		int num = (int)(Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);

	}

}
