import java.util.Scanner;
public class PlayWithNumbers {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int Q=s.nextInt();
        s.nextLine();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }
        s.nextLine();
        int[] L=new int[Q];
        int[] R=new int[Q];
        for(int i=0;i<Q;i++)
        {
            L[i]=s.nextInt();
            R[i]=s.nextInt();
            int mean=(int)((L[i]+R[i])/2);
            System.out.println(mean);
        }   // Write your code here

    }
}
