package java_OOPS_16th_Apr_2023;

public class Child extends Parent {

	public static void main(String[] args) {
		Child child = new Child("wine");
		child.cash();
		child.guitar();
		child.superCar();
		child.farmhouse();
		child.money();
		
		Parent parent = new Parent("Beer");
		parent.farmhouse();
		parent.money();
		
		
		

	}
	
	public void superCar() {
		System.out.println("Child's super car");
	}
	
	public  void guitar() {
		System.out.println("Child's guitar");
	}
	
	public  void cash() {
		System.out.println("Child's cash");
	}
	
	  public Child(String somethingSpecial) {
			super(somethingSpecial);
			
		}

}
