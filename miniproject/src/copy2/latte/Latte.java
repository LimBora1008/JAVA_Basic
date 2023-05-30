package copy2.latte;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 로그인관련 도메인 클래스
public class Latte {

	// 필드
	private String name;
	private int price;

	public Latte() {
	}

	public Latte(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffe [name=" + name + ", price=" + price + "]";
	}

} // end Login
