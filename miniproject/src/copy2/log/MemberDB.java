package copy2.log;

import java.util.ArrayList;
import java.util.List;

public class MemberDB {
	public List<Login> memberList;

	public MemberDB() {
		memberList = new ArrayList<Login>();
	}

	// 멤버 생성용 메소드
	public void addMember(Login login) {
		this.memberList.add(login);
	}

	// 아이디 호출용
	public String getId(String string) {
		String id = null;

		for (Login login2 : memberList) {
			id = login2.getId();
		}
		return id;
	}

	// 비밀번호 호출용
	public int getPw(int num) {
		int pw = 0;

		for (Login login2 : memberList) {
			pw = login2.getPw();
		}
		return pw;
	}

}
