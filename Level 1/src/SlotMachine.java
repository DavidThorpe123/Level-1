import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JButton button;
	Font f;
	Font f2;
	int ran = new Random().nextInt(4);
	int ran2 = new Random().nextInt(4);
	int ran3 = new Random().nextInt(4);
	String ranstring = Integer.toString(ran);
	String ranstring2 = Integer.toString(ran2);
	String ranstring3 = Integer.toString(ran3);

	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
	}

	SlotMachine() {
		frame = new JFrame();
		panel = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		button = new JButton();
		JOptionPane.showMessageDialog(null, "Click spin to spin the SlotMachine");
		f2 = new Font("Arial", Font.PLAIN, 30);
		f = new Font("Arial", Font.BOLD, 1000);
		frame.add(panel);
		panel.add(button);
		button.setFont(f2);
		button.setText("Spin");
		button.addActionListener(this);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		label1.setFont(f);
		label2.setFont(f);
		label3.setFont(f);
		label1.setText(ranstring);
		label2.setText(ranstring2);
		label3.setText(ranstring3);
		frame.setVisible(true);
		frame.pack();
		if (ranstring.equals(ranstring2) && ranstring.equals(ranstring3)) {
			JOptionPane.showMessageDialog(null, "You won");
		} else {
			JOptionPane.showMessageDialog(null, "You lost");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			int ran = new Random().nextInt(4);
			int ran2 = new Random().nextInt(4);
			int ran3 = new Random().nextInt(4);
			String ranstring = Integer.toString(ran);
			String ranstring2 = Integer.toString(ran2);
			String ranstring3 = Integer.toString(ran3);
			label1.setText(ranstring);
			label2.setText(ranstring2);
			label3.setText(ranstring3);
			if (ranstring.equals(ranstring2) && ranstring.equals(ranstring3)) {
				JOptionPane.showMessageDialog(null, "You won");
			} else {
				JOptionPane.showMessageDialog(null, "You lost");
			}
		}
	}
}
