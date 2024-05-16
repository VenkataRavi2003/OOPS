class Parent{
	public void m1(){
		System.out.println("Hey, i am from parent.");
	}
}
class Child extends Parent{ //single level inheritance.
	@Override
	public void m1(){
		System.out.println("Hey,i am from child.");
	}
}
public class SingleLevel_Inheritance{
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m1();

		Child child = new Child();
		child.m1();
	}
}