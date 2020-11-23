package chO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		//둘다 여려개의 문자를 못받음
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);//문자로받음
		BufferedReader br = new BufferedReader(ir);
		//데이터를 가변적 문자열을 받음
		
		try {
			String data = br.readLine();//블락킹
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
