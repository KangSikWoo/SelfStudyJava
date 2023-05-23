package sec01.exam10;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6 -> 인덱스 시작 위치, 4 -> 시작 위치부터 4개
		System.out.println(str2);
	}

}
