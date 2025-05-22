package message;

import Interface.ILogin;
import login.BasicLogin;
import login.Credential;

public class EmailMessage extends Message {
	public EmailMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}

	@Override
	public void send(String username, String password) { 
		final BasicLogin data = (BasicLogin) super.getLogin();
		
		if(data.authenticate(new Credential(username, password))) {
			System.out.println("Email sent from "+ super.getSender() + " to " + super.getRecepient() + ": " + super.getContent());
		} else {
			System.out.println("Email authentication failed for user: " + username);
		}
	}
}
