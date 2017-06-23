import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timer {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField field;

	Timer() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		field = new JTextField();
		frame.add(panel);
		panel.add(button);
		panel.add(field);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {
		Timer t = new Timer();
	}
}
