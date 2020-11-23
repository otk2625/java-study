package jsonex;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Com {
	private int id;
	private String coment;
}
public class Json01 {

	public static void main(String[] args) {
		Com c = new Com(1, "���1");
		//�ڹ� -> json(String)
		Gson gson = new Gson();
		String cjson = gson.toJson(c);
		System.out.println(cjson); //json�������� ��ȯ
		
		//json(String) -> �ڹ�
		Com c2 = gson.fromJson(cjson, Com.class);
		System.out.println(c2.getId());
		System.out.println(c2.getComent());
	}

}
