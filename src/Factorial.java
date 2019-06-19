import java.util.Scanner;
public class Factorial {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //Scanner
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();   // Writing output to STDOUT
        System.out.println(factorial(number));



        // Write your code here

    }

    public static int factorial(int num)
    {
        if(num==1)
            return 1;
        else
            return num*factorial(num-1);

    }
}
