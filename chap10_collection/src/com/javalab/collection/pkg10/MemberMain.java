package com.javalab.collection.pkg10;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {

		// Member 객체를 생성해서 List로 만들기
		String[] members = new String[10];
		members[0] = "임재,20190509,20190510,8,남,30대후반";
		members[1] = "성열,20190509,20190510,1,남,30대중반";
		members[2] = "천재,20190509,20190510,3,남,30대초반";
		members[3] = "현수,20190509,20190509,1,남,20대후반";
		members[4] = "진우,20190509,20190510,2,남,30대초반";
		members[5] = "영수,20190509,20190510,2,여,40대후반";
		members[6] = "종화,20190509,20190509,0,남,20대후반";
		members[7] = "윤정,20190509,20190510,3,여,40대후반";
		members[8] = "종호,20190509,20190510,3,남,20대중반";
		members[9] = "동현,20190509,20190510,5,남,20대중반";

		// ArrayList 생성
		List<Member> list = new ArrayList<Member>();

		// 반복문으로 members의 정보를 타입에 맞게 반환하여 list에 담기
		for (int i = 0; i < members.length; i++) {
			String[] sp = members[i].split(",");
			int num = Integer.parseInt(sp[3]); // 3번 인덱스 값(방문횟수)을 int형으로 변환
			char gen = sp[4].charAt(0); // 4번 인덱스값(성별)을 한글자만 불러와서 char타입으로 변환

			list.add(new Member(sp[0], sp[1], sp[2], num, gen, sp[5]));
		}

		// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
		System.out.print("이름이 천재 인 회원 : ");
		printName(list);

		System.out.println();

		// 3. 전체 회원을 출력해주는 메소드를 만드세요.
		System.out.println("전체 회원 리스트");
		printAll(list);

		System.out.println();

		// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요. 반환받은 리스트를 main 메소드에서 출력하세요.
		ArrayList<Member> list2 = print30(list);

		System.out.println("30대 회원 리스트");
		for (Member member : list2) {
			System.out.println(member.toString());
		}

		System.out.println();

		// 5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요
		int count = printCount(list);
		System.out.println("20대 후반들의 방문 횟수: " + count + "회");

	} // main

	// 20대 후반의 방문횟수 메소드
	private static int printCount(List<Member> list) {
		int count = 0;

		for (Member member : list) {
			if (member.getAge().equals("20대후반")) {
				count += member.getNumVisit();
			}
		}

		return count;
	}

	// 30대 회원 출력 메소드
	private static ArrayList<Member> print30(List<Member> list) {
		ArrayList<Member> mem = new ArrayList<Member>();
//		String age = "";

//		for (Member member : list) {
//			age = member.getAge().substring(0, 3);
//
//			if (age.equals("30대")) {
//				mem.add(member);
//			}
//		}

		for (Member member : list) {

			if (member.getAge().contains("30대")) { // . contains : 포함
				mem.add(member);
			}
		}
		return mem;
	}

	// 전체회원 메소드
	private static void printAll(List<Member> list) {
		for (Member member : list) {
			System.out.println(member.toString());
		}
	}

	// "천재" 회원 출력 메소드
	private static void printName(List<Member> list) {
		for (Member member : list) {
			if (member.getName().equals("천재")) {
				System.out.println(member.toString());

			}
		}
	}

} // class

class Member {
	private String name; // 이름
	private String joinDate; // 가입일
	private String lastVisitDate; // 최종방문일
	private int numVisit; // 방문횟수
	private char gender; // 성별
	private String age; // 연령대

	public Member() {
		super();
	}

	public Member(String name, String joinDate, String lastVisitDate, int numVisit, char gender, String age) {
		super();
		this.name = name;
		this.joinDate = joinDate;
		this.lastVisitDate = lastVisitDate;
		this.numVisit = numVisit;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	public int getNumVisit() {
		return numVisit;
	}

	public void setNumVisit(int numVisit) {
		this.numVisit = numVisit;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", joinDate=" + joinDate + ", lastVisitDate=" + lastVisitDate + ", numVisit="
				+ numVisit + ", gender=" + gender + ", age=" + age + "]";
	}

}
