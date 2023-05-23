package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 128;-> 컴파일 에러 : 범위 벗어남, byte 범위 : -128 ~ 127
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);

	}

}
