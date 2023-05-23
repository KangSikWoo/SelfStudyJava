package sec04.exam04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //공백 예외처리를 위한 Scanner class.
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();//enter 전까지의 문자열을 저장.
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) { //자바에선 문자열이 동일한지를 비교할 때는 .equal()사용
				break;
			}
		}
		
		System.out.println("종료");

	}

}
