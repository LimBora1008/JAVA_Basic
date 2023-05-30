package miniproject;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 로그인 화면 생성
class TeaForm extends JFrame implements ActionListener {

	public DataBase db; // 데이터베이스 선언

	private JTextField nameField; // 제품명 입력 텍스트필드
	private JTextField priceField; // 가격 입력 텍스트필드

	// 로그인 버튼 생성
	JButton addButton = new JButton("추가");

	// 기본생성자
	public TeaForm() {
	}

	// 오버로딩 생성자
	public TeaForm(DataBase db) {
		// 데이터베이스 전담 클래스의 객체를 전달받아서 선언한 변수에 저장함
		this.db = db;

		// 텍스트필드(입력칸)과 레이블 설정
		nameField = new JTextField(10); // 제품명
		priceField = new JTextField(10); // 가격

		JLabel nameLabel = new JLabel("제품명 :");
		JLabel priceLabel = new JLabel("가격 :");

		// 액션리스너 부착
		addButton.addActionListener(this);

		// 버튼,레이블,텍스트 필드를 배치할 패널 생성
		// 프레임 > 판넬 > 레이블 순으로 겹쳐진다
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(6, 2));
		// 판넬에 레이블 장착
		inputPanel.add(nameLabel);
		inputPanel.add(nameField);
		inputPanel.add(priceLabel);
		inputPanel.add(priceField);

		// 메인패널에 input+버튼 부착
		mainPanel.add(inputPanel, BorderLayout.CENTER);
		mainPanel.add(addButton, BorderLayout.EAST);

		// 프레임 설정
		setTitle("티 상품 등록 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 메인 패널을 프레임의 저장
		setContentPane(mainPanel);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			String name = nameField.getText();
			int price = Integer.parseInt(priceField.getText());
			
			miniproject.Tea tea = new Tea(name,price);
			this.db.addTea(tea);
			
			JOptionPane.showMessageDialog(this, "상품 추가 완료");
			
			this.dispose();
			
			MainMenu mainMenu = new MainMenu(db);
			mainMenu.setVisible(true);
		}

	}

	public static void main(String[] args) {
		new TeaForm(new DataBase());
	}

} // end LoginForm
