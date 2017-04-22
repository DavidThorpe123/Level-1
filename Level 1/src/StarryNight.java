import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class StarryNight {
	// 1. Create a new Robot.
	Robot robot = new Robot();

	public StarryNight() {
		// 2. Using your robot name, print the window width and height to the
		// console
		// robotname.getWindow().getWidth(), robotname.getWindow().getHeight()
		System.out.println(robot.getWindow().getWidth());
		System.out.println(robot.getWindow().getHeight());
		// 3. Set the robot's speed to draw FAST!
		robot.setSpeed(10);
		// 10. Do steps 7, 8 and 9 100 times.
		robot.hide();
		for (int i = 1; i < 101; i++) {
			System.out.println("Shurikens drawn " + i);
			// 7. Move your robot to a random position using the method created
			// in step 5. Use the random method to get the new X and Y
			// positions.
			// The syso in step 2 should help you determine how big your canvas
			// is.
			setPosition(randomNum(1, 1780), randomNum(1, 940));
			// 8. Set your robot pen color to be random, using the method
			// created in step 6.
			robot.setPenColor(randomNum(0, 256), randomNum(0, 256), randomNum(0, 256));
			// 9. Draw a star by calling your method created in step 4.
			// Use the random method to make the size of your star random.
			drawStar(randomNum(1, 100));
		}
		// 11. Hide your robot so that you can see your beautiful starry sky!!

	}

	// 4. Create a method that draws a star. It should have an int parameter
	// that determines the size of the star.
	// Hint: 144 degrees
	void drawStar(int size) {
		for (int i = 0; i < 4; i++) {
			robot.penDown();
			robot.turn(15);
			robot.move(50 + size);
			robot.turn(144);
			robot.move(50 + size);
			robot.turn(-73);
			robot.penUp();

		}

	}

	// 5. Create a method that moves the robot using setX and setY.
	// The method should have 2 int parameters for the X and Y position.
	void setPosition(int x, int y) {
		robot.moveTo(x, y);
	}

	// 6. Create a method that RETURNS a random number.
	// The method should have 2 int parameters for the minimum and maximum
	// values
	// of the random number.
	int randomNum(int min, int max) {
		return new Random().nextInt(max - min) + min;

	}

	public static void main(String[] args) {
		new StarryNight();
	}
}
