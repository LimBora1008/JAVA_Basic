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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogMenu extends JFrame implements ActionListener{
	public LogData ld;
	

	private JTextField idTextField; 
	private JTextField pwTextField; 
	private JButton loginButton = new JButton("로그인");
	private JButton memberButton = new JButton("회원가입");
	
	 public LogMenu() {
		 
		 // 텍스트 필드 생성
		 idTextField = new JTextField(10);
		 pwTextField = new JTextField(10);
		 
		 // 레이블 생성
		 JLabel idLabel = new JLabel("아이디 :");
		 idLabel.setSize(50,50);
		 JLabel pwLabel = new JLabel("비밀번호 :");
		 pwLabel.setSize(50,50);
		 
		 // 판넬 생성
		 JPanel mainPanel = new JPanel();
		 mainPanel.setLayout(new BorderLayout());
		 JPanel inPanel = new JPanel();
		 inPanel.setLayout(new GridLayout(3,2));
		 
		 inPanel.add(idLabel);
		 inPanel.add(idTextField);
		 inPanel.add(pwLabel);
		 inPanel.add(pwTextField);
		 inPanel.add(loginButton);
		 inPanel.add(memberButton);
		 
		 mainPanel.add(inPanel,BorderLayout.CENTER);

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
		
	}
	
	public static void main(String[] args) {
		new LogMenu();
	}

}
class LogData{
	// 필드
	public List<Login> loginList;

	public LogData() {
		loginList = new ArrayList<Login>();
	}
	
	
}
