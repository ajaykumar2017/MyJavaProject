import java.util.*;
public class CostOfBalloons {
    public static void main(String args[])
    {
//        Scanner s=new Scanner(System.in);
//        int T=s.nextInt();
//        s.nextLine();
//        int[] green=new int[T];
//        int[] purple=new int[T];
//        int[] n=new int[T];
//        int[] mincost=new int[T];
//        int[][] x=new int[T][];
//        int[][] y=new int[T][];
//        for (int i=0;i<T;i++)
//        {
//            green[i]=s.nextInt();
//            purple[i]=s.nextInt();
//            s.nextLine();
//            n[i]=s.nextInt();
//            x=new int[T][n[i]];
//            y=new int[T][n[i]];
//            for (int j=0;j<n[i];j++)
//            {
//                x[i][j]=s.nextInt();
//                y[i][j]=s.nextInt();
//            }
//        }
//        for (int i=0;i<T;i++)
//        {
//            int min;
//            if (green[i]>purple[i])
//                min=purple[i];
//            else min=green[i];
//            mincost[i]=0;
//            for (int j=0;j<n[i];j++)
//            {
//                if (x[i][j]==0&&y[i][j]==1)
//                    mincost[i]=mincost[i]+min;
//                else if (x[i][j]==1&&y[i][j]==0)
//                    mincost[i]=mincost[i]+min;
//                else if (x[i][j]==1&&y[i][j]==1)
//                    mincost[i]=mincost[i]+green[i]+purple[i];
//            }
//            System.out.println(mincost[i]);
//        }


        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        int[] green=new int[T];
        int[] purple=new int[T];
        int[] n=new int[T];
        int[][] x;
        int[][] y;
        int[] min=new int[T];
        int[] minCost=new int[T];
        for(int i=0;i<T;i++)
        {
            green[i]=s.nextInt();
            purple[i]=s.nextInt();
            s.nextLine();
            n[i]=s.nextInt();
            s.nextLine();
            x=new int[T][n[i]];
            y=new int[T][n[i]];
            if (green[i]>purple[i])
                min[i]=purple[i];
            else min[i]=green[i];
            for (int j=0;j<n[i];j++)
            {
                x[i][j]=s.nextInt();
                y[i][j]=s.nextInt();
            }
            minCost[i]=0;
            for (int j=0;j<n[i];j++)
            {
                if (x[i][j]==0&&y[i][j]==1)
                    minCost[i]=minCost[i]+min[i];
                else if (x[i][j]==1&&y[i][j]==0)
                    minCost[i]=minCost[i]+min[i];
                else if (x[i][j]==1&&y[i][j]==1)
                    minCost[i]=minCost[i]+green[i]+purple[i];
            }
            System.out.println(minCost[i]);
        }
    }
}
