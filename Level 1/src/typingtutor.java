import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {
	JFrame frame;
	JLabel label;
	JPanel panel;

	int score;

	char currentletter = generateRandomLetter();

	public static void main(String[] args) {
		typingtutor t = new typingtutor();
		int time = 60;
		for (int i = 59; i < time; i -= 1) {
			System.out.println(i);
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "You're WPM is");
				System.exit(1);
			}
		}

	}

	typingtutor() {
		frame = new JFrame();
		label = new JLabel();
		panel = new JPanel();

		frame.addKeyListener(this);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		label.setText(" " + currentletter);
		frame.setVisible(true);
		frame.setTitle("Type!");
		frame.add(label);
		frame.setOpacity(1);
		frame.setBackground(Color.red);
		panel.setBackground(Color.red);
		label.setBackground(Color.red);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (currentletter == e.getKeyChar()) {
			score++;
			System.out.println("One point earned " + score);
			frame.setBackground(Color.green);
			label.setBackground(Color.green);
		} else {
			score--;
			System.out.println("Wrong " + score);
			frame.setOpacity(0);
			frame.setBackground(Color.red);
			label.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentletter = generateRandomLetter();
		label.setText(" " + currentletter);

	}
}
