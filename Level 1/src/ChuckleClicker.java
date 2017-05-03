import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel panel;
	JFrame frame;
	JButton jokebutton;
	JButton punchline;

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();

	}

	ChuckleClicker() {
		panel = new JPanel();
		frame = new JFrame();
		punchline = new JButton();
		jokebutton = new JButton();
		jokebutton.addActionListener(this);
		punchline.addActionListener(this);
		frame.add(panel);
		panel.add(jokebutton);
		panel.add(punchline);
		frame.pack();
		frame.setVisible(true);

		jokebutton.setText("Joke");
		punchline.setText("Punchline");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jokebutton) {
			JOptionPane.showMessageDialog(frame, "Wanna hear a chemisty joke");
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(frame, "NA");
		}
	}
}
