package chO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		//�Ѵ� �������� ���ڸ� ������
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);//���ڷι���
		BufferedReader br = new BufferedReader(ir);
		//�����͸� ������ ���ڿ��� ����
		
		try {
			String data = br.readLine();//���ŷ
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
