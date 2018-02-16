package Day30Code;
/***
Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933

 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Phone_a_friend{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();// number of entries
      Map<String, Integer> phone_book = new HashMap<>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // check that the name does not exist already - to protect the error of having duplicate names in hashmap
          if(phone_book.size() > 0 )
          {
              if(phone_book.containsKey(name))  
                         phone_book.replace(name, phone);
              else
                         phone_book.put(name, phone); 
              
          }
          else
          {
              phone_book.put(name, phone);
          }
      }
      //print all entries
     phone_book.forEach((k,v)->{
         System.out.println(k + " " + v);
     });
      // search and print
      String query = in.next();
   
      while(query != null)
      {
         if(phone_book.containsKey(query))
         {
             System.out.println(query +"="+phone_book.get(query));
         }
          else{
              System.out.println("Not found");
          }
          if(in.hasNext())
          {
              query = in.next();
          }
          else
              break;
       }
      
      in.close();
  }
}
