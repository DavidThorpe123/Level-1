import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	JFrame frame2;
	JPanel panel;
	JButton button;
	int press = 0;

	public static void main(String[] args) {
		CandyMan candyman = new CandyMan();

	}

	CandyMan() {
		frame2 = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button.addActionListener(this);
		frame2.add(panel);
		panel.add(button);
		button.setText("Candyman");
		frame2.setVisible(true);
		frame2.pack();

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();

			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/League/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			press = press + 1;
		}
		if (press == 5) {
			showPictureFromTheInternet(
					"https://s-media-cache-ak0.pinimg.com/originals/50/61/fa/5061faf51bfcfd6e8630560755b3b7f3.jpg");
			playSound(SCREAM);
		}
		System.out.println(press);
	}
}
