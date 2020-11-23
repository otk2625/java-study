package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SmsData {
	private int id; //번호 1, 2, 3, 4
	private String text;	//문자 메시지 내용
	private String to;	//누구에게 보내는지
	private int errorCode; //에러코드
	private String sendTime; //언제보냈는지
}
