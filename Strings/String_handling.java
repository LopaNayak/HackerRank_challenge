package String_handling;

public class String_handling {

	public static boolean check_Palindrome(String word)
	{
		String rev = new StringBuffer(word).reverse().toString();
		if(rev.toLowerCase().equals(word.toLowerCase()))
			return true;
		
		return false;
	}
	
	  static void StringPool()
	  {
	    String st1= "Java";
	    String st2= "Java";
	    String st3= st1;
	    String st_obj1= new String("Java");
	    String st_obj2= new String("Java");
	    System.out.println("st1 and st2 :: String literal holding value of Java");
	    System.out.println("st4 and st5::  Java objects holding string value of Java \n ");
	    
	    System.out.println("Is st1== st2 ?:  "+(st1==st2));
	    System.out.println("Is st1== st3 ?:  "+(st1==st3));
	    System.out.println("Is st5== st4 ?:  "+(st_obj2==st_obj1));
	    
	    System.out.println("Does String literal and String object return true to the equality \n operator {==} check or do they return true to the equals object comparison?");
	    System.out.println("Is st1== st4 ?:  "+(st1==st_obj1));
	    System.out.println("Is st1.equals( st4 ) ?:  "+(st1.equals(st_obj1)));
	    System.out.println("\n verdict: \n since the two string references point to the same string \n in the pool, their equals check return true. \n However, the object references are different, since one is a \n object and other a literal. So, == check returns false.\n On similar lines, the string literals st1 and st2 return true \n to == check because they refer to the same \n literal in the pool and hold the same reference. \n Objects st5 and st4 are not equal as per the == check since they \n have different references(in heap) referring to the same shared location.");
	   
	    
	  }
	
	// reverse the string without using API
	public static String reverseStr(String s)
	  {
	    char temp[]= s.toCharArray();
	    char rev[] = new char[temp.length];
	    
	    for(int i = 0; i< temp.length; i++)
	    {
	      rev[i] = temp[(temp.length-1) - i];
	    }
	    
	     String bb = new String(rev);
	    //LESSON: TODO rev.toString() does not return a string from a char array. So create a String object and pass the char arr as argument  
	    return bb;
	  }
	  
	private void check_boolean()

	{
		boolean flag = false;
		if(flag = true)// assignment operator .here converting value of flag to true
		{
			System.out.print("True");
		}
		else
			System.out.print("false");
	}
	
	 
	  
	public static void main(String args[])
	{
		//System.out.println(String_handling.check_Palindrome("EroRE"));
		String_handling st = new String_handling();
		//st.check_boolean();
		String_handling.StringPool();
		
	}
}
