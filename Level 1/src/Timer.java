import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Timer implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton startbutton;
	JTextArea area;

	public String myString() {
		String question = JOptionPane.showInputDialog(null, "Number of Seconds?");
		int question2 = Integer.parseInt(question);
		String question3 = Integer.toString(question2);
		return question3;
	}

	Timer() {
		frame = new JFrame();
		panel = new JPanel();
		startbutton = new JButton();
		button = new JButton();
		area = new JTextArea();

		Dimension big = new Dimension(400, 400);
		Dimension frameSize = new Dimension(750, 750);
		panel.add(startbutton);
		frame.add(panel);
		panel.add(button);

		button.setSize(big);
		button.setText("Start timer");

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
			System.out.println(myString());
		}
		if (arg0.getSource() == startbutton) {

		}
	}

}
