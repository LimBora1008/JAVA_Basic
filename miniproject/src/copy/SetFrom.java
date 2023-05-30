package copy;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 셋팅 화면 생성
class SetFrom extends JFrame implements ActionListener {

	public DataBase db; // 데이터베이스 선언

	// 버튼 생성
	JButton coffeButton = new JButton("Coffe Set");
	JButton latteButton = new JButton("Latte Set");
	JButton teaButton = new JButton("Tea Set");

	// 기본생성자
	public SetFrom() {
	}

	// 오버로딩 생성자
	public SetFrom(DataBase db) {
		// 데이터베이스 전담 클래스의 객체를 전달받아서 선언한 변수에 저장함
		this.db = db;

		// 액션리스너 부착
		coffeButton.addActionListener(this);
		latteButton.addActionListener(this);
		teaButton.addActionListener(this);

		// 버튼,레이블,텍스트 필드를 배치할 패널 생성
		// 프레임 > 판넬 > 레이블 순으로 겹쳐진다
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(3,2));

		// 메인패널에 input+버튼 부착
		inputPanel.add(coffeButton);
		inputPanel.add(latteButton);
		inputPanel.add(teaButton);
		
		mainPanel.add(inputPanel);

		// 프레임 설정
		setTitle("상품 등록 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 메인 패널을 프레임의 저장
		setContentPane(mainPanel);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == coffeButton) {
			System.out.println("커피메뉴 등록");

			// 현재의 메인 메뉴 화면 닫기
			this.dispose();

			// 이동해갈 화면 객체 생성(커피등록폼)
			CoffeForm coffeForm = new CoffeForm(db);

			// 이동해갈 화면 보이기
			coffeForm.setVisible(true);
		} else if (e.getSource() == latteButton) {
			System.out.println("라떼메뉴 등록");
			// 현재의 메인 메뉴 화면 닫기
			this.dispose();

			// 이동해갈 화면 객체 생성(라떼등록폼)
			LatteForm latteForm = new LatteForm(db);

			// 이동해갈 화면 보이기
			latteForm.setVisible(true);
		} else if (e.getSource() == teaButton) {
			System.out.println("티/차 메뉴 등록");
			// 현재의 메인 메뉴 화면 닫기
			this.dispose();

			// 이동해갈 화면 객체 생성(티등록폼)
			TeaForm teaForm = new TeaForm(db);

			// 이동해갈 화면 보이기
			teaForm.setVisible(true);
		}

	}

	public static void main(String[] args) {
		new SetFrom(new DataBase());
	}

} // end LoginForm
