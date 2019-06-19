import java.util.Scanner;
public class BallonMinimumCost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] status;
        int T=sc.nextInt();
        sc.nextLine();
        int arrCost[][]=new int[T][2];
        int noOfstu[]=new int[T];
        int count[][]=new int[T][2];
        for (int i=0;i<T;i++){
            arrCost[i][0]=sc.nextInt();
            arrCost[i][1]=sc.nextInt();
            sc.nextLine();
            noOfstu[i]=sc.nextInt();
            sc.nextLine();
            status=new int[noOfstu[i]][2];
            count[i][0]=0;
            count[i][1]=0;
            for(int j=0;j<noOfstu[i];j++){
                status[j][0]=sc.nextInt();
                if (status[j][0]==1)
                    count[i][0]++;
                status[j][1]=sc.nextInt();
                if (status[j][1]==0)
                    count[i][1]++;
                sc.nextLine();
            }
        }
        int min[]=new int[T];
        for (int i=0;i<T;i++){
            min[i]=(count[i][0]*arrCost[i][0]+count[i][1]*arrCost[i][1])>(
                    count[i][0]*arrCost[i][1]+count[i][1]*arrCost[i][0])?
                    (count[i][0]*arrCost[i][0]+count[i][1]*arrCost[i][1]):
                    (count[i][0]*arrCost[i][1]+count[i][1]*arrCost[i][0]);
            System.out.println(min[i]);

        }

    }
}
