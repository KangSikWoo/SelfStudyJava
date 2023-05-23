package sec02.exam01;

import java.util.*;

//LIFO 자료구조,java에서는 Stack 클래스 제공
//push() : 주어진 객체를 스택에 넣습니다.
//peek() : 스택의 맨 위 객체를 가져옴, 객체 스택에서 제거X
//pop() : 스택의 맨 위 객체를 가져옴, 객체를 스택에서 제거

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty() ) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전" + coin.getValue() + "원");
		}

	}

}
