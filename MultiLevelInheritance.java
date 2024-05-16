class GrandParent{
	public  void marry(){
		System.out.println("Hey,marry to our caste girl only..");
	}
}
class Parent extends GrandParent{
	
}
class GrandChild extends Parent{
	@Override
	public  void marry(){
		System.out.println("No, grandpa i will marry to my loved one only!!");
	}
}
public class MultiLevelInheritance{
	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		System.out.print(gp.getClass().getName()+" :: ");
		gp.marry();

		Parent p = new Parent();
		System.out.print(p.getClass().getName()+"  :: ");
		p.marry();

		GrandChild gc = new GrandChild();
		System.out.print(gc.getClass().getName()+" :: ");
		gc.marry();
	}
}