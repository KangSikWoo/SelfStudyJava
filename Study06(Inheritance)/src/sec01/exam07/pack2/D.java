package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}

} //단 new 연산자를 사용해서 생성자를 직접 호출할 순 없고, 자식 생성자에서 super()로 A생성자 호출 가능
