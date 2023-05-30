package copy2.latte;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import copy2.DataBase;
import copy2.MainMenu;

public class LatteList extends JFrame implements ActionListener{
	
	/*
	 * 데이터베이스 역할을 하는 DatabaseClass 변수 선언
	 * 생성자에서 전달 받음. 가장 중요함.
	 */
	public DataBase db;

	// 학생 목록이 보여질 테이블
    private JTable table;	
    // 테이블을 다양한 기능을 사용할 수 있도록 해주는 클래스
    private DefaultTableModel tableModel;	

    // 기본 생성자
    public LatteList() {    	
    }
    
    /**
     * 생성자
     *  - 메인 메뉴에서 불려질 때 데이터베이스 클래스의 주소를 전달 받는다.
     *  - 전달 받은 데이터베이스 클래스에는 학생 ArrayList가 있다. 
     * @param db
     */
    public LatteList(DataBase db) {
    	// 데이터베이스 전담 클래스의 객체를 전달받아서 내가 선언한 변수에 저장함
    	this.db = db;
    	
        // 테이블 세팅
        String[] columnNames = {"상품명", "가격"};
        List<Latte> latteList = db.lattesList;
        Object[][] data = new Object[latteList.size()][6];
        
        for (int i = 0; i < latteList.size(); i++) {
        	Latte latte = latteList.get(i);
            data[i][0] = latte.getName();
            data[i][1] = latte.getPrice();
        }

        tableModel = new DefaultTableModel(data, columnNames);
        table = new JTable(tableModel);
        
        
        // Set up the button to add a new student
       JButton closeButton = new JButton("닫기");
       
        // 액션 리스너 부착
        closeButton.addActionListener(this);	// 액션 리스터 부착

        // 메인 패널 생성
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        // 입력 필드들이 놓일 input 패널 생성
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));
        
        // input 패널을 메인 패널에 다시 부착
        mainPanel.add(inputPanel, BorderLayout.SOUTH);
        // 닫기 버튼도 메인 패널에 부착
        mainPanel.add(closeButton, BorderLayout.SOUTH);

        // 프레임(윈도우 창) 설정
        setTitle("라떼 정보 입력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 액션 리스너 
	public void actionPerformed(ActionEvent e) {
        // 현재 열려있는 조회 화면을 닫음                
        this.dispose();
        
        MainMenu mainMenu = new MainMenu(db);
        mainMenu.setVisible(true);
	}
	
    public static void main(String[] args) {
    	new LatteList(new DataBase());
    }	
}
