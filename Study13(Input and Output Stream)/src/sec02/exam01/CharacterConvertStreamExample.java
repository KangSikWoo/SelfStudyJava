package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	

	//FileOutputStream에 OutputStreamWriter 연결
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	//FileInputStream에 InputStreamReader 연결
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); //InputStreamReader 보조 스트림을 이용하여 문자 입력, 읽어야 될 문자수 readCharNum에 저장
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
	

}
	

