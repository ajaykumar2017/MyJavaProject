/*
*Alice got a number written in seven segment format where each segment
  was creatted used a matchstick.

Example: If Alice gets a number 123 so basically Alice used
 12 matchsticks for this number.

Alice is wondering what is the numerically largest value
 that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.
 */
import java.math.BigInteger;
import java.util.*;
public class SeventhSegmentDisplay {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        int[] N = new int[T];
        int[] noSeg = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        for (int i = 0; i < T; i++) {
            N[i] = s.nextInt();
        }
        for(int i=0;i<T;i++)
        {
            int temp=N[i];
            int matches=0;
            if (temp==0){
                matches=6;
            }else{
                while (temp!=0)
                {
                    matches=matches+noSeg[temp%10];
                    temp=temp/10;
                }
            }

            System.out.println(maxNumberFromSticks(BigInteger.valueOf(matches)));
//            System.out.println(matches);
        }
    }
    private static BigInteger maxNumberFromSticks(BigInteger n)
    {
        BigInteger temp = new BigInteger("0");
        BigInteger num=n;
        while (n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))&&
                num.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))&&
                n.compareTo(BigInteger.valueOf(0))>0&&
                num.compareTo(BigInteger.valueOf(0))>0){
            temp=(temp.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(1));
            num=num.subtract(BigInteger.valueOf(2));
        }
        if (!(n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))){
            num=num.subtract(BigInteger.valueOf(3));
            temp=BigInteger.valueOf(7);
            while (!n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))&&
                    num.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))&&
                    n.compareTo(BigInteger.valueOf(0))>0&&
                    num.compareTo(BigInteger.valueOf(0))>0){
                temp=(temp.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(1));
                num=num.subtract(BigInteger.valueOf(2));
            }
        }
        return temp;
    }
}
