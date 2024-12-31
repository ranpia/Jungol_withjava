package q614;

public class School {
	private String schoolname="Jejuelementary";
	private int grade=6;
	
	public School(String Schoolname, int grade) {
		this.schoolname=Schoolname;
		this.grade=grade;
	}
	
	public void print() {
		System.out.println(this.grade+" grade in "+this.schoolname+" School");
	}
}
