package message;

import Interface.ILogin;

public abstract class Message {
	private ILogin login; //contoh dependency inversion di mana login bisa digunakan oleh email maupun sms (tidak spesifik ke satu jenis pesan saja)
	private String sender;
	private String recepient;
	private String content;
 
	public ILogin getLogin() {
		return login;
	}

	public String getSender() {
		return sender;
	}

	public String getRecepient() {
		return recepient;
	}

	public String getContent() {
		return content;
	}

	public Message(ILogin login, String sender, String recepient, String content) {
		this.login = login;
		this.sender = sender;
		this.recepient = recepient;
		this.content = content;
	}
	
	public abstract void send(String username, String password);
}
