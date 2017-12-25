package oOPS_concepts;

import java.io.IOException;

public class Shape {
	// 1. Private method cant be overidden
	private void peekaBoo()
	{
		System.out.println("superclass peekaBoo");
	}
	
	/** Scene 3: log method is declared as public in super class
	 * **/
	public void log()
	{
	    System.out.println("superclass shape");
	}
	
	public Object test()
	{
		System.out.println("Super.test");
		return true;
	}
	//5. cannot override final method
	final public void dont_mess_with_TX()
	{
		System.out.println("final method cannot be overidden");
	}

	//6. A method declared static cannot be overridden but can be re-declared.
	public static void super_stat()
	{
		System.out.println("STATIC method cannot be overidden. But can be redeclared");
	}
	
	// 7. the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. 
	 public void exceptiontest() throws IOException
    {
		 System.out.println("Superclass throws a checked exception");
    }
	// 8. Constructors cannot be overridden.
	 public void Shape()
	{
			System.out.println("Square constructor code");
	}

}
