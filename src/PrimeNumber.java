import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        int i,k,m=0,flag;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//it is the number to be checked
        for (k=2;k<=n;k++){
            m=k/2;
            flag=0;
            for (i=2;i<=m;i++){
                if (k%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.print(k+" ");
        }
    }
}
