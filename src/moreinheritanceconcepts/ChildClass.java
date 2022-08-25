package moreinheritanceconcepts;

public class ChildClass extends SuperClass {
	ChildClass(){
		this(100);
		System.out.println("No Arg Child Class Constructor");
	}
	ChildClass(int x){
		super(x);
		System.out.println("No Arg Child Class Constructor");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
