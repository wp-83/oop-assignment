package login;

import Interface.ILogin;

public class BasicLogin implements ILogin {
	private Credential credential;

	public BasicLogin(String username, String password) {
		credential = new Credential(username, password);
	}

	@Override
	public boolean authenticate(Credential credential) {
		if(this.credential.getUsername().equals(credential.getUsername()) && this.credential.getKey().equals(credential.getKey())) {
			return true;
		}
		
		return false;
	}
}
