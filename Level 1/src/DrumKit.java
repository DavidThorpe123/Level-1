
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter implements ActionListener {

	JLabel[] drumLabelWithImage;

	String drums[] = { "snare.jpg", "kick.jpg" };
	int i = 0;
	int l = 1;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {

		drumLabelWithImage = new JLabel[drums.length];
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame frame = new JFrame();

		// 2. Make the frame visible

		// 3. Set the size of the frame
		frame.setSize(750, 500);
		// 4. Set the title of the frame
		frame.setTitle("DrumKit");
		// 5. Make a JPanel and initialize it.
		JPanel panel = new JPanel();

		// 6. Add the panel to the frame. (The panel is invisible.)
		frame.add(panel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
		// 8. Put the name of your image in a String variable.

		// 9. Edit the next line to use your String variable
		// drumLabelWithImage = createLabelImage(drumImageString);
		panel.setLayout(new GridLayout());

		// 10. Add the image to the panel
		for (int j = 0; j < drumLabelWithImage.length; j++) {
			drumLabelWithImage[j] = createLabelImage(drums[j]);
			drumLabelWithImage[j].addMouseListener(this);

		}
		panel.add(drumLabelWithImage[i]);
		panel.add(drumLabelWithImage[l]);

		// 11. Set the layout of the panel to "new GridLayout()"
		// 12. call the pack() method on the frame
		frame.pack();
		frame.setVisible(true);
		// 13. add a mouse listener to drumLabelWithImage.

	}

	public void mouseClicked(MouseEvent e) {

		if (e.getSource() == drumLabelWithImage[l]) {
			playSound("kick.wav");
		} else {
			playSound("snare.wav");
		}
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.
		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
