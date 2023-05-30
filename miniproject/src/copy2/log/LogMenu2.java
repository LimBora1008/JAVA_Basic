package copy2.log;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogMenu2 extends JFrame implements ActionListener {

	private JTextField idTextField;
	private JTextField pwTextField;
	private JButton loginButton = new JButton("로그인");
	private JButton memberButton = new JButton("회원가입");

	public LogMenu2() {

		// 텍스트 필드 생성
		idTextField = new JTextField(10);
		pwTextField = new JTextField(10);

		// 레이블 생성
		JLabel idLabel = new JLabel("아이디 :");
		idLabel.setSize(50, 50);
		JLabel pwLabel = new JLabel("비밀번호 :");
		pwLabel.setSize(50, 50);

		// 판넬 생성
		JPanel mainPanel = new JPanel();
//		 mainPanel.setLayout(new GridLayout(3,2));

		mainPanel.add(idLabel);
		mainPanel.add(idTextField);
		mainPanel.add(pwLabel);
		mainPanel.add(pwTextField);
		mainPanel.add(loginButton);
		mainPanel.add(memberButton);

		loginButton.addActionListener(this);
		memberButton.addActionListener(this);

		add(mainPanel);
		// 프레임 설정
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 setSize(300,150);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			System.out.println("로그인");
			String id = idTextField.getText();
			int pw = Integer.parseInt(pwTextField.getText());

			MemberDB memberDB = null;
			if(id.equals(memberDB.getId(id))) {
				System.out.println("ㅇㅇㅇㅇ");
			}
		}

	}

	public static void main(String[] args) {
		new LogMenu2();
	}

}
