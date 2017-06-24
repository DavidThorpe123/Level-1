import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timer implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField field;

	Timer() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		field = new JTextField();
		Dimension big = new Dimension(400, 400);
		Dimension frameSize = new Dimension(750, 750);
		frame.add(panel);
		panel.add(button);
		panel.add(field);
		field.setSize(big);
		button.setSize(big);
		field.setText(" ");
		frame.setVisible(true);
		frame.setSize(frameSize);

	}

	public static void main(String[] args) {
		Timer t = new Timer();
	}

	public int getTime() {
		String time = field.getText();
		int time2 = Integer.parseInt(time);
		System.out.println(time2);
		return time2;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == button) {
			System.out.println(getTime());
		}
	}

}
