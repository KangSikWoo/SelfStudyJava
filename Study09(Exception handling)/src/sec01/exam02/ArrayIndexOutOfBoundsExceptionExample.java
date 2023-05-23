package sec01.exam02;

//배열에서 인덱스 범위를 초과하는 예외
public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = args[0];
		String data2 = args[1]; //data1,2에  실행 매개값을 주지 않았기 때문

		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);
	}

}
