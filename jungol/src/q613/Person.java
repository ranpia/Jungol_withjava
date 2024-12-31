package q613;

public class Person {
	private String name;
	private String school;
	private int grade;
	
	public Person(String name, String school, int grade){
		this.name=name;
		this.school=school;
		this.grade=grade;
	}
	
	public void print() {
		System.out.println("Name : " + this.name);
		System.out.println("School : " + this.school);
		System.out.println("Grade : " + this.grade);
	}
	
}
