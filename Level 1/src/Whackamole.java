import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole {

	JFrame frame;
	JPanel panel;

	public static void main(String[] args) {
		Whackamole w = new Whackamole();
		w.drawButtons(50);
	}

	Whackamole() {

		frame = new JFrame();
		panel = new JPanel();
		drawButtons(50);

		frame.add(panel);
		frame.setVisible(true);
	}

	void drawButtons(int numberofbuttons) {
		int ran = new Random().nextInt(numberofbuttons);
		for (int i = 0; i < numberofbuttons; i++) {

			JButton ran2 = new JButton();

			ran2.setText(Integer.toString(ran));
			panel.add(ran2);
			if (i == ran) {
				ran2.setText("Mole");
			}

		}
	}
}
