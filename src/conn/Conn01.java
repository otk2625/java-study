package conn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn01 {

	public static void main(String[] args) {
		FileWriter fout = null;
		int c;
		try {
			//1.�ּҼ��� URLŬ���� ��� 
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			//2.���ۿ����� ���� ��Ʈ���� ����
			HttpsURLConnection conn = 
					(HttpsURLConnection) url.openConnection();
			
			//3.���ۿ��� (8192byte) ����Ʈ�� ���� ���ڵ��� �˾ƾ� ��
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input = null;
			String download = "";
			fout = new FileWriter("D:\\workspace\\test.html");
			while((input = br.readLine()) != null) {
				download += input;
				
			}
			fout.write(download,0,download.length());
			System.out.println(download);
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println("오늘의 온도는 : " + temp.get(0).text());
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}

}
