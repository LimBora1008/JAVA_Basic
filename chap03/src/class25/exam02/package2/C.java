package class25.exam02.package2; // 클래스 A,B 와 패키지가 다름

import class25.exam02.package1.A;

public class C {
	
	// 필드 선언

	A a1 = new A(true); 	// public 접근제한자 (모두) 
//	A a2 = new A(1);		<< default 접근제한자(같은 패키지 내)
//	A a3 = new A("문자열");	<< private 접근제한자(같은 클래스 내)

}
