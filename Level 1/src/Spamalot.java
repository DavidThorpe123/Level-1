import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField field;
	static final String FAKE_USERNAME = "haxamiritexddd@gmail.com";
	static final String FAKE_PASSWORD = "arrows123";

	public static void main(String[] args) {
		Spamalot s = new Spamalot();

	}

	Spamalot() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button2 = new JButton();
		field = new JTextField();

		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(field);
		field.setBackground(Color.RED);
		field.setText("Phone number");
		button.setText("BAD");
		button.addActionListener(this);
		button2.setText("GOOD");
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	private boolean sendSpam(String recipient, String subject, String content, int spamAmount) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			for (int i = 0; i < spamAmount; i++) {
				Transport.send(message);
				System.out.println(spamAmount);
			}
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button2) {
			sendSpam("kidgamingservice@gmail.com", "Spammed", "#Hacked by a spammer xD", 50);
		}
		// TODO Auto-generated method stub

	}

	String sendTextMessage(String phoneNumber, String message, int spamAmount) {
		if (sendSpam(phoneNumber + "@tmomail.net", "", message, spamAmount))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "", message, spamAmount))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "", message, spamAmount))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message, spamAmount))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "", message, spamAmount))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "", message, spamAmount))
			return "Nextel";
		return "FAIL!";
	}
}
