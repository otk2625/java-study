package ch07;

import lombok.Data;

@Data
class ResponseDto<T> { //대문자는 규칙
	private int statusCode; //200(성공), 300(다시요청), 400(잘못된 요청)
	private T data; //아직 정해지지 않음 타입
}

public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
		System.out.println(dto.getStatusCode());
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
		
		
	}
}
