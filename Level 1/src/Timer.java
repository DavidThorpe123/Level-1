import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timer implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton startbutton;
	JTextField field;
	boolean hasSetNumber = false;

	Timer() {
		frame = new JFrame();
		panel = new JPanel();
		startbutton = new JButton();
		button = new JButton();
		field = new JTextField();

		Dimension big = new Dimension(400, 400);
		Dimension frameSize = new Dimension(750, 750);
		panel.add(startbutton);
		frame.add(panel);
		panel.add(button);
		field.setText("                    ");
		panel.add(field);
		button.setSize(big);
		button.setText("Click this button to set the time");
		button.addActionListener(this);
		startbutton.addActionListener(this);
		startbutton.setText("Click this to actually start counting down");
		frame.setVisible(true);
		frame.setSize(frameSize);

	}

	public static void main(String[] args) {
		Timer t = new Timer();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// TODO Auto-generated method stub
		if (arg0.getSource() == button) {
			String question = JOptionPane.showInputDialog(frame, "Number of Seconds?");
			int question2 = Integer.parseInt(question);
			String question3 = Integer.toString(question2);
			field.setText(question3);
			hasSetNumber = true;
		}
		if (arg0.getSource() == startbutton && hasSetNumber == false) {
			JOptionPane.showMessageDialog(frame, "Choose a number!");
		} else if (arg0.getSource() == startbutton && hasSetNumber == true) {

		}
	}

}
