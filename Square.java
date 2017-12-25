/**inheritance: Overriding rules
 * DEFINE: Overriding refers to the ability of a subclass to re-implement an instance method inherited from a superclass. 
 * Overriding means a scene where two classes in an inheritance relationship, have a method with same/similar
 * signature, the subclass method shadows the implementation of the super class method. 
 * Super class method :: overriden method 
 * Sub class method :: overriding method 
 * *********************************************************************************************************************
 * 1. Which methods? Only inherited methods can be overriden. Therefore, Never Private methods
 * 2. Cannot reduce the visibility of the super class method ## log()
 * 3. CRITERIA 1: The argument list should be exactly the same as that of the overridden method. ##log
 * 4. CRITERIA 2: The return type should be the same or a subtype of the return type declared in 
 *    the original overridden method in the super class.
 * 5. A method declared final cannot be overridden. 
 * 6. A method declared static cannot be overridden but can be re-declared. 
 * 7. The overriding method must not throw new or broader checked exceptions.
 * 8. Constructors and instance initializer blocks cannot be overridden.
 * **/

package oOps_concepts_2;
import java.io.IOException;

import oOPS_concepts.*;

public class Square extends Shape{
	/** Scene 2: log method is declared as protected in sub class
	 * Compile time error for reducing the visibility of log method from public to protected
	 * ************************************************************************************
	 * REASON: The reason is, you might want to give an instance of your subclass as an type of 
	 * the superclass to a consumer. This consumer tries to run the (public) method he is used 
	 * to run, since it's public, but you hid it with making it protected. To prevent this, 
	 * this rule is introduced. (the problem is visibility, not static!).**/
	
	//protected void log() : CT error code. hence commented
	public void log()
	{
	    System.out.println("subclass shape log");
	}
	// 4. Subclass has same return type or a return type that is a subclass of the super class 
	// Subclass has a different return type than Super class. 
	// since Boolean return type is a subclass of Object return type, this is allowed
	public Boolean test() 
	{
		System.out.println("sub.test");
		return true;
	}
	
	
	//5. cannot overide final method...CT error. hence commented out
	// Reason: Final class is Immutable and overidding is against immutability. hence blocked
	/* public void dont_mess_with_TX()
	{
		System.out.print("final method cannot be overidden");
	}
	*/
	
	//6. A method declared static cannot be overridden but can be re-declared. 
	//   Reason: because a static method is available to all instances of the superclass 
	//   and its subclasses, so it’s not permissible to re-implement the static method in a particular subclass. 
	//  Although the static method is redeclared and is not overriding the super class method, it does hide the superclass
	//  method. Hiding is different from overriding. There is a way to access the hidden method but there is no
	//  way to access a overriden super class method.
	
	public static void super_stat()
	{
		System.out.println("redeclared static method");
	}
	
	// 6. B Accessing hidden method that is static
	
	void accessHiddenMethod() 
	{
		super_stat();    // this calls the method in subclass, since superclass method is hidden
 
        // because the Shape's super_stat() is hidden, it requires to use
        // a fully qualified class name to access it.
        Shape.super_stat();
    }
	
	//7. The overriding method must not throw new or broader checked exceptions.
	//  public void exceptiontest() throws Exception  >>Gives Compile time error. Hence commented
	
	public void exceptiontest()
	{
		 System.out.println("Sub class throws a broader exception");
    }
	 
	// 8.Constructors cannot be overridden.
	// REASON: constructors usually work with instance variables initializations. since instance variables are not inheritable,
	// constructors cannot be overridden
	
	public void Square()
	{
		System.out.println("Square constructor code");
	}
	
	public static void main(String args[])
	{
		Shape sObj = new Square();
		sObj.test();  // o/p: sub.test
		sObj.log();   // o/p: subclass shape
	//  sObj.peekaBoo() ; // Compile Time Error as it is private in super class
		sObj.super_stat();
		System.out.println("Static hidden method study");
		Square sq = new Square();
		sq.accessHiddenMethod(); 
		
		//testing if constructors can be overridden.
		
	}
	
}


