package ch06;

class user2 {
	private String id;
	private String username;
	private String password;
	
	public user2(String id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "user2 [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		user2 user = new user2("1","ssar","1234");
		System.out.println(user); 
		//�ڹٴ� ���۷����� ����ϸ� toString()�� �ڵ����� ���
		String s = "�ȳ�";
		System.out.println(s);
		System.out.println(s.toString());
	}
}
