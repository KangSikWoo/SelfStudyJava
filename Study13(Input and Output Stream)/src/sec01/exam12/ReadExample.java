package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer); //한 문자 씩 읽기, readcharNum에는 읽어야되는 문자의 갯수가 몇 개인지 저장되어 있고, 이것을 char형으로 변환하면 문자열 읽기 가능
			if(readCharNum == -1) break;
			for(int i = 0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();

	}

}
