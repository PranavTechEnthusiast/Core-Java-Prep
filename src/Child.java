/**This core test is to test the knowledge on constructor in abstractclass,
 * Wrapper class default value initialization,null pointer exceptions. 
 * 
 * Good to test basics
 * 
 * @author Pranav
 *
 */
public class Child extends Parent{
	Child(){
		i = 0;
		System.out.println("Child constructor");
	}
	
	public Integer i;
	public static void main(String[] args) {
		Child ch = new Child();
		//ch.doSomething();
		
	}

	@Override
	public void doSomething() {
		//throws null pointer exception 
		//try{
			System.out.println("The string value of i is"+i.toString());
		/*}catch(Exception e){
			System.out.println("Exception caught");
		}*/
	}

}
