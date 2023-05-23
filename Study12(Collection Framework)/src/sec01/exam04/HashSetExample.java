package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java는 한 개만 저장./중복이 안되기 때문
		set.add("iMATIS"); //java는 한번에 저장됨.
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size); 
		Iterator<String> iterator = set.iterator(); //반복자
		while(iterator.hasNext()) { 
			String element = iterator.next(); //1개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("iMATIS");
		set.remove("JDBC");
		
		System.out.println("총 객 수 : " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음.");}

	}

}
