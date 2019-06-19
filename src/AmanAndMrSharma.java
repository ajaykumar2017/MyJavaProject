import java.math.BigInteger;
import java.util.*;
public class AmanAndMrSharma {
    public static void main(String args[] ){
        Scanner s = new Scanner(System.in);
        int d=s.nextInt();
        s.nextLine();
        long[] r=new long[d];
        long[] x=new long[d];
        for(int i=0;i<d;i++)
        {
            r[i]=s.nextLong();
            x[i]=s.nextLong();
        }
        int sum=0;
        for(int i=0;i<d;i++)
        {
            int pi=22/7;
            BigInteger area = new BigInteger("1");
            area = area.multiply(BigInteger.valueOf(Integer.parseInt(Integer.toString(pi)))).
                    multiply(BigInteger.valueOf(Long.parseLong(Long.toString(r[i])))).multiply(BigInteger.valueOf(Long.parseLong(Long.toString(r[i]))));
            // long area=(22/7)*r[i]*r[i];
            BigInteger hor=new BigInteger("1");
            hor=hor.multiply(BigInteger.valueOf(Long.parseLong(Long.toString(100*x[i]))));
            int result = area.compareTo(hor);
            if(result==-1) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}