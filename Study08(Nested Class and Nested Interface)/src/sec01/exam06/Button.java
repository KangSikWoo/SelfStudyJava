package sec01.exam06;

public class Button {
	OnClickListener listener; //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	} //매개 변수의 다형성
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}

}
