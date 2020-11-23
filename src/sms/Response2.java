package sms;

public class Response2 {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "group_id : "+ group_id + "\nerror_list : " + error_list
				+ "\nsuccess_count : " + success_count
				+ "\nerror_count : " + error_count;
	}
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2Glu80uAkQlVazl\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		Response2 res = new Response2();
		
		String a = data.substring(1, 89);
		a.trim();
		a = a.replace("{", "");
		
		String[] log = a.split(",");
		for (int i = 0; i < log.length; i++) {
			log[i] = log[i].replace("\"","");
			log[i].trim();
		}
		String[] gid = log[0].split(":");
		String[] el = log[1].split(":");
		String[] sc = log[2].split(":");
		String[] ec = log[3].split(":");
		
		res.group_id = gid[1];
		res.error_list = el[2];
		res.success_count = sc[1];
		res.error_count = ec[1];
	
		System.out.println(res);
		
	}
}
