import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleCalculator {
	JFrame jframe;
	JButton jbutton;
	JButton sub;
	JButton multiply;
	JButton divide;
	JPanel jpanel;
	JTextField input;
	JTextField inputwo;
	JTextArea answer;
	JPanel answers;
	JPanel buttons;

	SimpleCalculator() {
		GridLayout rows = new GridLayout(3, 0);
		multiply = new JButton();
		sub = new JButton();
		divide = new JButton();
		jframe = new JFrame();
		input = new JTextField("First Text");
		inputwo = new JTextField("Second Text");
		jbutton = new JButton();
		jpanel = new JPanel();
		buttons = new JPanel();
		answers = new JPanel();
		answer = new JTextArea();
		jpanel.add(input);
		jpanel.add(inputwo);
		buttons.add(jbutton);
		buttons.add(sub);
		buttons.add(multiply);
		buttons.add(divide);
		answers.add(answer);
		jframe.setLayout(rows);
		jframe.add(jpanel);
		jframe.add(buttons);
		jframe.add(answers);
		jbutton.setText("Add");
		sub.setText("Subtract");
		multiply.setText("Multiply");
		divide.setText("Divide");
		answer.setText("55");

		jframe.pack();
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner s = new Scanner(System.in);
	}

}
