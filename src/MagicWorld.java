import java.util.Scanner;
public class MagicWorld {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        int[] N=new int[T];
        String[] str=new String[T];
        for (int i=0;i<T;i++)
        {
            N[i]=s.nextInt();
            s.nextLine();
            str[i]=s.next();
        }for (int k=0;k<T;k++)
        {

            char[] ch=str[k].toCharArray();
            char[] temp=new char[N[k]];
            for (int i=0;i<N[k];i++){
                temp[i]=ch[i];
            }
            for (int i=0;i<N[k];i++)
            {
                if (temp[i]>'x')
                    ch[i]='q';
                if (!isPrime(temp[i])&&temp[i]<'y'){
                    int n=temp[i];
                    n++;
                    int countn=0;
                    while(!isPrime(n))
                    {
                        n++;
                        countn++;
                    }
                    int countm=0;
                    int m=temp[i];
                    m--;
                    while(!isPrime(m))
                    {
                        m--;
                        countm++;
                    }
                    if (countm>countn)
                    {
                        ch[i]=(char)n;
                    }else if (countm==countn)
                    {
                        ch[i]=(char)m;
                    }else{
                        ch[i]=(char)m;
                    }
                }
            }
            for (int i=0;i<N[k];i++)
            {
                System.out.print(ch[i]);
            }System.out.println();
        }



        // Write your code here

    }
    static boolean isPrime(int k)
    {
        int i,m=0,flag=0;
        int n=k;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    return false;
                }
            }
            if(flag==0)  { return true; }
        }//end of else

        return false;
    }
}
