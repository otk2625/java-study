package Login;

public class Kakao implements OAuth {
	private String provider;
	private String id;
	private String pass;
	private String name;
	
	public Kakao() {
		this("kakao","ssar@nate.com","1234","����");
	}
	public Kakao(String provider, String id, String pass, String name) {
		super();
		this.provider = provider;
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String oauthPriovider() {
		// TODO Auto-generated method stub
		return provider;
	}
	@Override
	public String oauthID() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return pass;
	}
	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	
	
}
