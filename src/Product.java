/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;
import java.lang.Math;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Product {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner sc = new Scanner(System.in);   // Writing output to STDOUT
        int N=sc.nextInt();
        sc.nextLine();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        long product=1;
        for(int i=0;i<N;i++){
            product=product*A[i];
        }
        long rem=  (product%(int)(Math.pow(10,9)+7));
//        System.out.println((int)product);
        System.out.println(rem);




        // Write your code here

    }
}
