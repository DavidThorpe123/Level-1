import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.turn(230);
		Tortoise.move(300);
		Tortoise.turn(130);
		Tortoise.penDown();
		// house();

		for (int i = 0; i < 10; i++) {
			int height = new Random().nextInt(250);
			Color color = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
			house("small", color);
			Tortoise.turn(-90);
			Tortoise.move(10);
			Tortoise.turn(-90);

		}
	}

	private static void pointyhouse() {
		Tortoise.move(100);
		Tortoise.turn(45);
		Tortoise.turn(90);
		Tortoise.move(100);
	}

	private static void house(String h, Color color) {
		int height = 0;
		if (h.equals("small")) {
			height = height + 150;
		}
		if (h.equals("medium")) {
			height = height + 200;
		}
		if (h.equals("tall")) {
			height = height + 250;
		}
		Tortoise.setPenColor(color);
		Tortoise.move(height);
		Tortoise.turn(90);
		Tortoise.move(40);
		Tortoise.turn(90);
		Tortoise.move(height);
		if (h.equals("small")) {
			pointyhouse();
		}

	}
}
