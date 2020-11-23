package ch04;
class Job {
	public Job() {
		// TODO Auto-generated constructor stub
	}
	
	
}
class Police extends Job {
	String name = "°æÂû";

	public Police(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Doctor extends Job{
	String name = "ÀÇ»ç";

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Array02 {

	public static void main(String[] args) {
		Job[] jobs = new Job[2];
		//jobs[0] = new Police();
		

	}

}
