package copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 초기화면 - 메인 메뉴 - 프로그램 구동후 가장 먼저 보여지는 화면 - 여기에서 다른 화면으로 이동함.
 */
public class MainMenu extends JFrame implements ActionListener {
	/*
	 * 데이터베이스 역할을 하는 DatabaseClass 변수 선언 생성자에서 전달 받음. 가장 중요함.
	 */
	public DataBase db;

	// 화면에서 사용할 입력필드, 버튼, 레이블 변수 선언(GUI components)
	private JLabel titleLabel;
	private JButton SETButton;
	private JButton coffeListButton;
	private JButton latteListButton;
	private JButton teaListButton;
	private JButton exitButton;

	// 본 클래스에는 기본 생성자 생성 금지 //

	/**
	 * 생성자 - 메인 메뉴에서 불려질 때 데이터베이스 클래스의 주소를 전달 받는다. 
	 * - 전달 받은 데이터베이스 클래스에는 학생 ArrayList등이 있다.
	 * @param db
	 */
	public MainMenu(DataBase db) {
		// 데이터베이스 전담 클래스의 객체를 전달받아서 내가 선언한 변수에 저장함
		this.db = db;

		// 프레임 설정
		setTitle("이젠다방");
		setLayout(new GridLayout(10, 1));
		setSize(300, 400);

		// 프레임 타이틀 설정
		titleLabel = new JLabel("메뉴를 선택하세요.");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add(titleLabel);

		// 각 화면을 버튼으로 만들어서 프레임에 부착 - 커피등록
		SETButton = new JButton("[SET]");
		SETButton.addActionListener(this);
		add(SETButton);

		// 커피 List button
		coffeListButton = new JButton("커피 리스트");
		coffeListButton.addActionListener(this);
		add(coffeListButton);

		// 라떼 List button
		latteListButton = new JButton("라떼 리스트");
		latteListButton.addActionListener(this);
		add(latteListButton);

		// 티 List button
		teaListButton = new JButton("티/차 리스트");
		teaListButton.addActionListener(this);
		add(teaListButton);

		// Exit button
		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);
		add(exitButton);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// 각 메뉴 버튼 클릭시 할일 정의
	public void actionPerformed(ActionEvent e) {
		// 커피등록이 눌렸는가?
		if (e.getSource() == SETButton) {
			System.out.println("메뉴 등록");

			// 현재의 메인 메뉴 화면 닫기
			this.dispose();

			// 이동해갈 화면 객체 생성
			SetFrom setFrom= new SetFrom(db);

			// 이동해갈 화면 보이기
			setFrom.setVisible(true);

		} else if (e.getSource() == coffeListButton) {
			System.out.println("커피");
			// 현재 화면 닫기
			this.dispose();
			// 이동해갈 화면 객체 생성
			CoffeList coffeList = new CoffeList(db);
			// 이동해갈 화면 보이기
			coffeList.setVisible(true);

		} else if (e.getSource() == latteListButton) {
			System.out.println("라떼");
			// 현재 화면 닫기
			this.dispose();
			// 이동해갈 화면 객체 생성
			LatteList latteList = new LatteList(db);
			// 이동해갈 화면 보이기
			latteList.setVisible(true);

		} else if (e.getSource() == teaListButton) {
			System.out.println("티/차");
			// 현재 화면 닫기
			this.dispose();
			// 이동해갈 화면 객체 생성
			TeaList teaList = new TeaList(db);
			// 이동해갈 화면 보이기
			teaList.setVisible(true);
		} else if (e.getSource() == exitButton) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MainMenu(new DataBase());
	}
}
