package sec03;

public class IndexOfContains {
	public static void main(String[] args) {
		String subject ="자바 프로그래밍";
		
		 int location = subject.indexOf("프로그래밍"); // indexOf란? subject의 값에 '프로그래밍'이 몇번째 있는가?
		 System.out.println(location); 
		 
		 String subString = subject.substring(location); // substring란? subject안에 ( ) 값을 출력
		 System.out.println(subString);
		 
		 location = subject.indexOf("자바");
		 if(location != -1) {
			 System.out.println("자바와 관련된 책이군요");
		 }else {
			System.out.println("자바와 관련없는 책이군요");
		}
		 
		 boolean result = subject.contains("자바"); // contains란? subject의 값에 '자바'란 값이 있는가?
		 if(result) {
			 System.out.println("자바와 관련된 책이군요");
		 }else {
				System.out.println("자바와 관련없는 책이군요");
			}
	}

}
