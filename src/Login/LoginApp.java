package Login;

//����ڰ� �α����� �� -> ���̽���, ���̹�
public class LoginApp {
	//�������̽� ���
	static void userInfo(OAuth o) {
		System.out.println(o.oauthPriovider()+"�� �α����� ����ڴ�...");
		System.out.println(o.oauthID());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Facebook f = new Facebook();//�α����ϸ� �ڵ����θ������
		Naver n = new Naver();
		Kakao k = new Kakao();
		userInfo(f);
		userInfo(n);
		userInfo(k);

	}

}
