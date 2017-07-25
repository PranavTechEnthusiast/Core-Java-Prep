
public abstract class Parent {
	public abstract void doSomething();
	
	Parent(){
		System.out.println("Parent constructor");
		doSomething();
	}
	
	/*Abstract class can not be instantiated;
	 *  but it can have a constructor and can be invoked if it has a main method*/
	/*static public   void main(String args[]){
		System.out.println("Main in Abstract");
//		someMethod();
	}
	*/
	public void someMethod(){
		System.out.println("Some method in Abstract");
	}
}
