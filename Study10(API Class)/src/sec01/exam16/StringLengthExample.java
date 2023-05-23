package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "7306241230123";
		int length = ssn.length(); //.length는 공백을 포함한 길이를 반환한다.
		
		if(length == 13) {
			System.out.println("주민 번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민 번호 자릿수가 아닙니다.");
		}

	}

}
