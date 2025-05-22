package message;

import Interface.ILogin;
import login.Credential;
import login.OAuthLogin;

public class SMSMessage extends Message { //contoh penerapan Liskov substitution di mana class SMSMessage bisa menerapkan semua behaviour dari superclass (Message)
	public SMSMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}

	@Override
	public void send(String username, String password) {
		final OAuthLogin data = (OAuthLogin) super.getLogin();
		
		if(data.authenticate(new Credential(username, password))) {
			System.out.println("SMS sent from " + super.getSender() + " to " + super.getRecepient() + ": " + super.getContent());
		} else {
			System.out.println("SMS authentication failed for user: " + username);
		}
	}
}
