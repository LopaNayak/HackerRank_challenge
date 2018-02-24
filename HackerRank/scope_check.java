package Day30Code;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
// Add your code here
    
 // Add your code here
    public Difference(int[] arr )
    {
        this.elements = arr;
    }

    public void computeDifference()
    {
        // find biggest number
        int big = this.elements[0];
        int small = this.elements[0];
        for(int i =0; i< this.elements.length ; i++)
        {
            if(this.elements[i] > big)
                big = this.elements[i];
            if(this.elements[i] < small)
                small = this.elements[i];
        }
        // find differerce
        maximumDifference = Math.abs(big - small);
    }

}
public class scope_check {
	  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
