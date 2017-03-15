import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClickCounter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField field;
	Dimension dim = new Dimension(500, 500);
	int i = 0;

	public static void main(String[] args) {
		ClickCounter clickcounter = new ClickCounter();

	}

	ClickCounter() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		field = new JTextField();
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setPreferredSize(dim);
		button.setFont(new Font("Arial", Font.PLAIN, 75));
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			i = i + 1;
			button.setText("Click " + i);
			System.out.println(i);
		}
		if (i == 100) {
			System.out.println("Congrats you win!");
			System.exit(0);
		}
	}

}
