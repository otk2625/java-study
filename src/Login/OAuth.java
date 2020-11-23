package Login;

//인터페이스
interface OAuth {
	public abstract String oauthPriovider();
	public abstract String oauthID();
	public abstract String oauthPassword();
	public abstract String oauthNick();
}
