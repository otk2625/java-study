package review;

//TV4��, �Ｚ, LG, ���, �Ϸ�Ʈ��

//������ �ο� 
//����ڿ��� ���� �������̽� ����
//���α׷�©�� �Ǽ� ���� �߻�
interface ������ { 
	void change();
}

class �Ｚ������ implements ������ {
	@Override
	public void change() {
		System.out.println("�Ｚ ä�κ���");
	}
}

class LG������ implements ������ {
	@Override
	public void change() {
		System.out.println("LG ä�κ���");
	}
}

public class Ex12 {
	
	static void ä�κ���(������ r) {
		r.change();
	}
	public static void main(String[] args) {
//		������ r = new LG������();
//		r.change();
//		������ s = new �Ｚ������();
//		s.change();
		ä�κ���(new LG������());
		ä�κ���(new �Ｚ������());
		
		//�͸� Ŭ����
		������ r = new ������() {
			
			@Override
			public void change() {
				System.out.println("�ȳ�");
			}
		};
		r.change();
	}

}
