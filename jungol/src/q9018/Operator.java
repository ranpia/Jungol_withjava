package q9018;

public class Operator {
	private int x;
	private int y;
	Operator(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void print() {
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x+" * "+y+" = "+(x*y));
		System.out.println(x+" / "+y+" = "+(x/y));
		System.out.println(x+" % "+y+" = "+(x%y));
	}

}
