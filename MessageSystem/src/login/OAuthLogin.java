package login;

import Interface.ILogin;

public class OAuthLogin implements ILogin {
	private Credential credential;
	
	public OAuthLogin(String otp) {
		credential = new Credential(" ", otp);
	}

	@Override
	public boolean authenticate(Credential credential) { //salah satu penerapan dari open/close di mana method dari ILogin ini open for extend and close for modification 
		if(this.credential.getKey().equals(credential.getKey())) {
			return true;
		}
		
		return false;
	}
}
