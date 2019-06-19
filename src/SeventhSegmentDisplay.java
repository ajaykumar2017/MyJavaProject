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
            System.out.println(maxNumberFromSticks(noSeg[N[i]]));
        }
    }
    static int maxNumberFromSticks(int n)
    {
        return n;
    }
}
