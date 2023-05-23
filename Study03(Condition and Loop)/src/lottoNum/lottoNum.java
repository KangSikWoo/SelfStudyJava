package lottoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lottoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lottoNum = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++) {
			lottoNum.add(i);
		}
		
		Collections.shuffle(lottoNum);
		
		for(int i = 0; i < 7; i++) {
			System.out.print(lottoNum.get(i) + " ");
		}
		
		
		
	}

}
