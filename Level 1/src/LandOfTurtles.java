import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	JFrame frame;
	MultiTurtlePanel panel;

	LandOfTurtles() {

		frame = new JFrame();
		frame.setVisible(true);

	}

	void addpanel(MultiTurtlePanel panel) {
		frame.add(panel);
		this.panel = panel;

	}

	void addTurtle() {
		for (int i = 0; i < 50; i++) {
			int x = new Random().nextInt(1000);
			int y = new Random().nextInt(1000);
			Turtle turtle = new Turtle();
			// turtle.show();
			panel.addTurtle(turtle);
			turtle.setX(x);
			turtle.setY(y);
		}
	}

	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		LandOfTurtles lof = new LandOfTurtles();
		// 1. Create a frame & make it visible
		lof.addpanel(panel);

		// 2. Add the panel to the frame

		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		lof.addTurtle();
		// 5. Add the turtle to the panel

		// 6. Put 50 Turtles on the beach

	}
}