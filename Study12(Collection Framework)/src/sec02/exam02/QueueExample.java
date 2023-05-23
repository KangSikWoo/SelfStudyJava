package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

//FIFO 자료구조 : Queue -> 인터페이스
//offer() : 주어진 객체를 넣음
//peek() : 객체를 하나 가져옴, 객체 큐에서 제거 X
//poll() : 객체 하나 가져옴, 객체 큐에서 제거

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) { //Queue에 더 이상 요소가 없을 때까지
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" : 
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendKaKaotalk" : 
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}
		}
		
		

	}

}
