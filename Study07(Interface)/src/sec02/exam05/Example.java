package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; //InterfaceA 변수는 methodA()만 호출 가능
		ia.methodA(); 
		System.out.println();
		
		InterfaceB ib = impl; //InterfaceB 변수는 methodB()만 호출 가능
		ib.methodB(); 
		System.out.println();

		InterfaceC ic = impl; //InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
