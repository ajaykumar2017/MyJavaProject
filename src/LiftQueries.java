import java.util.*;
public class LiftQueries {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        int[] n=new int[t];
        for(int i=0;i<t;i++)
        {
            n[i]=s.nextInt();
        }
        int a=0;
        int b=7;
        for(int i=0;i<t;i++)
        {
            if(Math.abs(b-n[i])>=Math.abs(n[i]-a))
            {
                System.out.println("A");
                a=n[i];
            }
            else
            {
                System.out.println("A");
                b=n[i];
            }

        }
    }
}
