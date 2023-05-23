package sec01.exam03;

//배열이 인덱스를 초과하는 경우 개선 코드
public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 2 ) {
			String data1 = args[0];
			String data2 = args[1]; //data1,2에  실행 매개값을 주지 않았기 때문

			System.out.println("args[0] : " + args[0]);
			System.out.println("args[1] : " + args[1]);
		}
		else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}

	}

}
