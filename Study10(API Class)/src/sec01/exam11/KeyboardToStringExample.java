package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2); //배열을 문자열로 반환, -2인 이유는 enter로 들어간 \r, \n부분은 포함시키지 않아도 되기 때문
		System.out.println(str);
	}

}
