package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//DTO = Data Transfer Object => 통신에서 많이 사용됨.
class UserDto {
	private int id;
	private String name;
}
public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:ㅋㅋㅋㅋ";
		String[] s = data.split(",");
		String[] idFull = s[0].split(":");
		String[] nameFull = s[1].split(":");
		
		System.out.println(s[0]);
		//파싱 parsing(구문 분석)
		UserDto dto = new UserDto();
		dto.setId(Integer.parseInt(idFull[1]));
		dto.setName(nameFull[1].trim());
		System.out.println(dto);
	}
}
