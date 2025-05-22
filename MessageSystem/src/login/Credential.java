package login;

public class Credential {
	private String username;
	private String key;
	
	public Credential(String username, String key) {
		this.username = username;
		this.key = key;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getKey() {
		return key;
	}	
}
