package vandong;

import javax.swing.UIManager;

public class MyMain {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception e) {
			e.printStackTrace();
		}
		new MyFrame("Group 5 - OOP");
	}
}
