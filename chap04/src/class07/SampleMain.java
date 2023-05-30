package class07;

public class SampleMain {

	public static void main(String[] args) {

		String[] members = new String[3];
		members[0] = "1,홍길동";
		members[1] = "2,김철수";
		members[2] = "3,이영희";

		Sample[] samples = new Sample[3];
		
		for (int i = 0; i < members.length; i++) {

			String[] sp = members[i].split(","); // sp[0]"1" 	 sp[1]"홍길동"

			int tempId = Integer.parseInt(sp[0]);
			// Integer.parseInt : 문자열을 int타입으로 변환 >>> tempid(int 1) = sp[0]("1")

			samples[i] = new Sample(tempId, sp[1]);
			// 객체생성
		}
		

		for (Sample sample : samples) {
			System.out.println(sample.getId() + " " + sample.getName());
		}

	}

}
