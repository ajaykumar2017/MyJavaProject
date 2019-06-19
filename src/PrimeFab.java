import java.util.Scanner;
public class PrimeFab {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n%2==0)
            findPrime(n/2);
        else System.out.println(findFab((n/2)+1));
    }


    static void findPrime(int num)
    {
        int n=2;
        int temp=0;
        int count=0;
        while (count!=num)
        {
            int m=n/2;
            int flag=0;
            for (int j=2;j<=m;j++)
            {
                if (n%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                count++;
                if (count==num)
                    temp=n;
            }
            n++;
        }
        System.out.println(temp);
    }

    static int findFab(int n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else
            return findFab(n-1)+findFab(n-2);
    }
}
