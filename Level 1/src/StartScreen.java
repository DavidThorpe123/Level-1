import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StartScreen implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton startbutton;
	JButton startbuttontimer;
	JButton helpbutton;
	JTextArea area;

	public StartScreen() {
		frame = new JFrame();
		panel = new JPanel();
		startbutton = new JButton();
		startbuttontimer = new JButton();
		helpbutton = new JButton();

		GridLayout grid = new GridLayout(2, 0);
		Dimension framesize = new Dimension(400, 400);
		Dimension Big = new Dimension(200, 50);
		startbuttontimer.setPreferredSize(Big);
		startbuttontimer.setText("Start Timer");
		startbutton.setPreferredSize(Big);
		startbutton.setText("Start Calculator");
		startbutton.addActionListener(this);
		startbuttontimer.addActionListener(this);
		helpbutton.setPreferredSize(Big);
		helpbutton.setText("Help");
		helpbutton.addActionListener(this);
		frame.add(panel);
		frame.setLayout(grid);
		frame.setTitle("Utilities");

		panel.add(startbutton);
		panel.add(startbuttontimer);
		panel.add(helpbutton);
		frame.setVisible(true);
		frame.setSize(framesize);

	}

	public static void main(String[] args) {
		StartScreen s = new StartScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == startbutton) {
			SimpleCalculator.main(null);
		}
		if (e.getSource() == startbuttontimer) {
			Timer.main(null);
		}
		if (e.getSource() == helpbutton) {
			JOptionPane.showMessageDialog(frame,
					"This program is designed to give you everyday utilities you need! To get started simply press on of the button have the utilities.");
		}

	}

}
