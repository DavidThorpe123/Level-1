
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String url = "http://i2.kym-cdn.com/entries/icons/original/000/019/422/IMG_4983.PNG";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What game is this from");
		// 7. print "CORRECT" if the user gave the right answer
		quizWindow.remove(image);
		if (answer.equalsIgnoreCase("Fallout 4")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");

		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)
		String url2 = "http://oce.leagueoflegends.com/sites/default/files/styles/scale_xlarge/public/upload/jhin_insights_article-banner_web_1280x720.jpg";
		url2 = "file:///Users/league/Desktop/jhin_insights_article-banner_web_1280x720.png";
		Component image2;
		// 11. add the second image to the quiz window
		image2 = createImage(url2);
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 13. ask another question
		String lol = JOptionPane.showInputDialog("Where do you take this champ top, mid , jungle, support, or ADC");
		// 14+ check answer, say if correct or incorrect, etc.
		if (lol.equalsIgnoreCase("ADC")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			System.exit(0);
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
