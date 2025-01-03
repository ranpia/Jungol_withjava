package q615;

public class Person {
	private String name;
	private int korean=0;
	private int english=0;
	
	public Person(String name, int korean, int english) {
		this.name=name;
		this.korean=korean;
		this.english=english;
	}
	
	public void print() {
		System.out.println(this.name+" "+this.korean+" "+this.english);
	}
	
	public int getKor() {
		return this.korean;
	}
	
	public int getEng() {
		return this.english;
	}
	
}
