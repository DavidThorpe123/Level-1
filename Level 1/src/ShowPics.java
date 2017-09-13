import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowPics implements MouseListener {
	JFrame frame;
	JPanel panel;
	int i = 0;
	String pics[] = { "keyboard.png", "mouse.png", "monitor.jpg" };
	JLabel label[];

	public static void main(String[] args) {
		ShowPics sp = new ShowPics();
	}

	ShowPics() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.addMouseListener(this);
		label = new JLabel[pics.length];

		for (int j = 0; j < label.length; j++) {
			label[j] = loadImageFromComputer(pics[j]);

		}
		frame.add(label[i]);
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		frame.setVisible(false);
		frame.remove(label[i]);

		i++;
		i = i % label.length;
		frame.add(label[i]);
		System.out.println("Showing new pic");
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
