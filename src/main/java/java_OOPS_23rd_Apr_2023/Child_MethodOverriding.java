package java_OOPS_23rd_Apr_2023;

public class Child_MethodOverriding extends Parent_MethodOverriding{

	public static void main(String[] args) {
		
		Child_MethodOverriding child = new Child_MethodOverriding();
		child.display();
		child.cash(1000000);
		
		Parent_MethodOverriding parent = new Parent_MethodOverriding();
		parent.display();
		parent.cash(10000000);
	}
	
	public void display() {
		System.out.println("This is child's display method");
	}
	
	public void cash(int money) {
		System.out.println("this is child's money");
	}

}
