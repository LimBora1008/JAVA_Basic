package miniproject;

import java.util.*;

// 데이터를 보관하는 역할

public class DataBase {
	// 필드
	public List<Coffe> coffeList; // 커피 배열
	public List<Latte> lattesList; // 커피 배열
	public List<Tea> TeaList; // 커피 배열
	
	
	// 생성자 : DB가 객체로 생성되면서 필드를 담을 ArrayList 객체가 생성됨
	public DataBase() {
		coffeList = new ArrayList<Coffe>();
		lattesList = new ArrayList<Latte>();
		TeaList = new ArrayList<Tea>();
	}

	// 목록 출력용 메소드
	public List<Coffe> getCoffeList() {
		return coffeList;
	}
	
	public void setCoffeList(List<Coffe> loginList) {
		this.coffeList = loginList;
	}
	
	public List<Latte> getLattesList() {
		return lattesList;
	}

	public void setLattesList(List<Latte> lattesList) {
		this.lattesList = lattesList;
	}

	public List<Tea> getTeaList() {
		return TeaList;
	}

	public void setTeaList(List<Tea> teaList) {
		TeaList = teaList;
	}

	// 커피정보 추가 메소드
	public void addCoffe(Coffe coffe) {
		this.coffeList.add(coffe);
	}
	
	// 라떼정보 추가 메소드
	public void addLatte(Latte latte) {
		this.lattesList.add(latte);
	}
	
	// 티정보 추가 메소드
	public void addTea(Tea tea) {
		this.TeaList.add(tea);
	}
	
	
}
