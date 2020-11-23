package chO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	public String getData() {
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			return br.readLine(); //버퍼를 비워내는것
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ㄱㅊ ㅋ");
		}
		return "";
	}
}
