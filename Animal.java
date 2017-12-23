/** Scene 1: parent.food() is protected field.-> 
 create a parent obj in child class, and trying to access the parent.food() from the 
 main function of child class gives compile error. 
 
 Reason:  parent object created outside home package has no access to any protected 
 members in that package - even if that member is its own class member.  
 
 **/
package oOPS_concepts;// default access modifier means all its members are visible only in the package.

import oOps_concepts_2.Bird;

public class Animal {
protected void food()
{
	System.out.print("solid and not just water");
}

public static void main(String args[])
{
	Animal an2Obj = new Animal();	
	an2Obj.food();
	Bird bi = new Bird(); // bi object is invoked in its own class context hence works fine. 
	bi.food();
}
}


