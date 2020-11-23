package Login;

//사용자가 로그인할 때 -> 페이스북, 네이버
public class LoginApp {
	//인터페이스 사용
	static void userInfo(OAuth o) {
		System.out.println(o.oauthPriovider()+"로 로그인한 사용자는...");
		System.out.println(o.oauthID());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Facebook f = new Facebook();//로그인하면 자동으로만들어짐
		Naver n = new Naver();
		Kakao k = new Kakao();
		userInfo(f);
		userInfo(n);
		userInfo(k);

	}

}
