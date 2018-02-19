package Day30Code;


import java.util.*;

//@author: Lopa Nayak
public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        //Reading the array input from i/O
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //compute the number of hourglasses
        int hg_count = (6 - 2) * (6 -2);  // hg_count = 16
        
        int hg[] = new int[hg_count];
        int hg_i = 0, i=0, p=0, ref, sec, third, mid_row, third_row;
        //proceesing the array to fetch results into the hourglass array. hg[]
        
        for(i=0; i< 4; i++ ) //the row counter
        {
               ref=i;  //the first row in the 3x3 hourglass    
               
               mid_row = i+1; //the second row in the 3x3 hourglass 
               
               third_row = mid_row+1; //the third row in the 3x3 hourglass 
               
              for(p=0;p<4;p++)
               {
                   sec=p+1;     //the second column in the 3x3 hourglass 
                   third=sec+1; //the third column in the 3x3 hourglass 
                   hg[hg_i] = arr[ref][p] + arr[ref][sec] + arr[ref][third]+
                                          arr[mid_row][sec] +
                              arr[third_row][p] + arr[third_row][sec]+arr[third_row][third];
                   
                   hg_i++;
               }
           }
         
         //finding the largest number in the hg(hourglass array)
         
         int kk=1;
         int temp = hg[0];
         while(kk < hg.length)
         {
             if(temp < hg[kk])
             {
                 temp = hg[kk];
             }
             kk++;
         }
         
         System.out.println("the biggest hourglass number is"+temp);   
   }
}
