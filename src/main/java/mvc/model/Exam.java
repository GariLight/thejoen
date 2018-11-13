package mvc.model;

import java.util.Arrays;

public class Exam {
	
	String name;
//	String [] subject;
	String [] subject= {"국어","수학","영어"};
	int [] jum;
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	
	public Exam(String name, int ... jum) {
		this.name = name;
		this.jum = jum;
	}
	
	@Override
	public String toString() {
		return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getJum() {
		return jum;
	}
	public void setJum(int[] jum) {
		this.jum = jum;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
	
	
	
}
