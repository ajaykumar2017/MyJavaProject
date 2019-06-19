import java.util.*;
public class FibonacciSequence {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        int[] num=new int[N];
        for (int i=0;i<N;i++)
        {
            num[i]=s.nextInt();
        }
        for (int i=0;i<N;i++)
        {
            if (isFibonacciSeries(num[i]))
            {
                int index=fabIndex(num[i]);
                    int x=0;
                    int y=0;
                    switch (index){
                        case 1: break;
                        case 2: x++;break;
                        case 3: x++;y++;break;
                        case 4: y++;break;
                        case 5: x--;y++;break;
                        case 6: x--;break;
                        case 7: x--;y--;break;
                        case 8: y--;break;
                        case 9: x++;y--;break;
                        case 10:x+=2;y--;break;
                        case 11: x+=2;break;
                        case 12: x+=2;y++;break;
                        case 13: x+=2;y+=2;break;
                        case 14: x++;y+=2;break;
                        case 15: y+=2;break;
                        case 16: y+=2;x--;break;
                        case 17: y+=2;x-=2;break;
                        case 18: x-=2;y++;break;
                        case 19: x-=2;break;
                        case 20: x-=2;y--;break;
                    }
                    System.out.println(x+" "+y);


            }
        }
    }

    static boolean isFibonacciSeries(int n)
    {
        boolean isFib=false;
        int[] fibSer=new int[20];
        for (int i=0;i<20;i++)
        {
            fibSer[i]=fibNum(i+1);
        }
        if (check(fibSer,n))
            isFib=true;
        return isFib;
    }
    static int fabIndex(int num)
    {
        int temp=0;
        int[] fibSer=new int[20];
        for (int i=0;i<20;i++)
        {
            fibSer[i]=fibNum(i+1);
        }
        for (int i=0;i<20;i++)
        {
            if (fibSer[i]==num)
                temp=i+1;
        }
        return temp;
    }
    static int fibNum(int n)
    {
            if (n==1)
                return 0;
            else if (n==2)
                return 1;
            else
                return fibNum(n-1)+fibNum(n-2);
    }
    static boolean check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        return true;

    }
}
