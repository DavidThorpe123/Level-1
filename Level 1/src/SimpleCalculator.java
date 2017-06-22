import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
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
		multiply.addActionListener(this);
		sub.addActionListener(this);
		divide.addActionListener(this);
		jbutton.addActionListener(this);
		jframe.pack();
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner s = new Scanner(System.in);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbutton) {
			System.out.println("Adding");
			answer.setText(add());
		}
		if (e.getSource() == sub) {
			System.out.println("Subcracting");
			answer.setText(subb());

		}
		if (e.getSource() == multiply) {
			System.out.println("Multiplying");
			answer.setText(multiplyy());
		}
		if (e.getSource() == divide) {
			System.out.println("Dividing");
			answer.setText(dvide());
		}
	}

	public String add() {
		input.getText();
		int num1 = Integer.parseInt(input.getText());
		inputwo.getText();
		int num2 = Integer.parseInt(inputwo.getText());

		String answer2 = Integer.toString(num1 + num2);
		return answer2;

	}

	public String multiplyy() {
		input.getText();
		int num1 = Integer.parseInt(input.getText());
		inputwo.getText();
		int num2 = Integer.parseInt(inputwo.getText());

		String answerr = Integer.toString(num1 * num2);
		return answerr;
	}

	public String dvide() {
		input.getText();
		float num1 = Float.parseFloat(input.getText());
		inputwo.getText();
		float num2 = Float.parseFloat(inputwo.getText());
		String answerrr = Float.toString(num1 / num2);
		return answerrr;
	}

	public String subb() {
		input.getText();
		int num1 = Integer.parseInt(input.getText());
		inputwo.getText();
		int num2 = Integer.parseInt(inputwo.getText());
		String answerrrr = Integer.toString(num1 - num2);
		return answerrrr;
	}

}
