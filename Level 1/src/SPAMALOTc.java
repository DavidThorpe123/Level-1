
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

public class SPAMALOTc implements ActionListener {
	static final String FAKE_USERNAME = "randommeme1905@gmail.com";
	static final String FAKE_PASSWORD = "DankMeme";
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JTextField textfield;

	SPAMALOTc() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		button1 = new JButton();
		// button2 = new JButton();
		frame.setVisible(true);
		panel.setVisible(true);
		panel.add(button1);
		// panel.add(button2);
		button1.setText("GO");
		// button2.setText("BAD");
		button1.setVisible(true);
		// button2.setVisible(true);
		textfield = new JTextField(30);

		panel.add(textfield);
		textfield.setText("E-Mail");
		button1.addActionListener(this);
		// button2.addActionListener(this);
		frame.pack();

	}

	public static void main(String[] args) {
		SPAMALOTc sa = new SPAMALOTc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			sendSpam(textfield.getText(), "get spammed by #gettrolled", "SpamBot:)");
		}
		// att cingularme.com
		// tmobile vmobile.com
		// verizon @vtext.com
	}

	private boolean sendSpam(String recipient, String subject, String content) {

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
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
