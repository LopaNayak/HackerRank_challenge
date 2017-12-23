/** This exercise shows the true essence of protected access modifier in inheritance relationship. 
 * Lets create an object of superclass or reference of superclass pointing to subclass 
 * object in the context of the subclass.
 * Scene 1: superclass method food() is declared as protected.
 * sup_obj.food() --> compile time error.
 * Scene 2: superclass method food() is declared public
 * sup_obj.food() --> no error
 * Scene 3: subclass object is created in subclass main method
 * sub_obj.food() --> compiles file. 
 * conclusion: Subclass object in subclass main method has access to superclass protected method is a foreign package only because of protected access modifier
 * superclass object has no access to its own method because it is created outside its home package. 
 *  **/

package oOps_concepts_2;
import oOPS_concepts.*;

public class Bird extends Animal {

	/*protected void food()
	{
		System.out.print("grains/fruits ");
	}*/
	
	public static void main(String args[])
	{
		
		Animal an2Obj = new Animal();
		Animal anRef = new Bird();
	//	anRef.food(); // compile error
	//	an2Obj.food(); // compile error
     
		Bird bi = new Bird(); // bi object is invoked in its own class context hence works fine. 
		bi.food();
	}
}
