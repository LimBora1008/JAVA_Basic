package class26.exam04;

public class StudentMain {

	public static void main(String[] args) {
		Student[] arrStd = new Student[5];

		// 기초 데이터
		arrStd[0] = new Student("김홍철", 23, '남', "010-2340-1233", 85);
		arrStd[1] = new Student("정순미", 24, '여', "010-9857-7532", 70);
		arrStd[2] = new Student("이만섭", 22, '남', "010-6548-4687", 96);
		arrStd[3] = new Student("최주호", 20, '남', "010-2528-9368", 85);
		arrStd[4] = new Student("고미림", 26, '여', "010-1068-2549", 77);

		// 일반for문을 이용한 출력
		System.out.println("=============================================");
		System.out.println(" name   age    gender       phone     score");
		System.out.println("---------------------------------------------");

		int sumScor = 0;
		int maxScor = 0;
		String maxName = "";

		for (int i = 0; i < arrStd.length; i++) {
			System.out.print(arrStd[i].name + "\t");
			System.out.print(arrStd[i].age + "\t");
			System.out.print(arrStd[i].gender + "\t");
			System.out.print(arrStd[i].phone + "\t");
			System.out.print(arrStd[i].score + "\n");
			
			sumScor += arrStd[i].score;
			if (maxScor < arrStd[i].score) {
				maxScor = arrStd[i].score;
				maxName = arrStd[i].name;
			}
		}
		System.out.println("=============================================");
		System.out.println("총인원: " + arrStd.length);
		System.out.printf("평균점수 : %4.2f \n", ((double) sumScor / arrStd.length));
		System.out.printf("최고점수는 : %d점 이며 최고점의 학생은 : %s님 입니다 \n", maxScor, maxName);
		
		System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////
		// 향상된 for문 + 메소드 호출
		System.out.println("=============================================");
		System.out.println(" name   age    gender       phone     score");
		System.out.println("---------------------------------------------");
		
		for (Student student : arrStd) {
			System.out.println(student.showStudentInfo());
		}
		System.out.println("=============================================");
	}

}
