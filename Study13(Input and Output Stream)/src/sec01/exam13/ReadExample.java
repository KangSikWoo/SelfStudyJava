package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer);
		if(readCharNum != -1) {
			for(int i = 0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();

	}

}
