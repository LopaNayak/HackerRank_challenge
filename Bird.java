package oOps_concepts_2;

public class Bird extends oOPS_concepts.Animal {

	protected void food()
	{
		System.out.print("grains/fruits ");
	}
	
	public static void main(String args[])
	{
		oOPS_concepts.Animal an = new Bird();
		an.food();
// Compile time error as method food from Animal class is not visible here. Animal.foo that methods are protected
	}
}
