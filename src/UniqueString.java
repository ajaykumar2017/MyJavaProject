import java.util.*;
public class UniqueString {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        char[] ch1=ch;
        for (int i=0;i<ch.length;i++)
        {
            for (int j=0;j<ch.length;j++)
            {
                if (i!=j){
                    if (ch[i]==ch1[j])
                    {
                        ch1[i]=' ';
                    }
                }

            }
        }
        String str2=new String(ch1);
        String str3=str2.replace(" ","").trim();
        int N=str3.length();
        char[] strNew=str3.toCharArray();
        int[] index=new int[N];
        for (int i=0;i<N;i++)
        {
            index[i]=0;
            for (int j=0;j<ch.length;j++)
            {
                if (strNew[i]==ch[j]){
                    index[i]=index[i]+1;
                }
            }
            System.out.println(strNew[i]+" "+index[i]);
        }
//        for (int i=0;i<N;i++)
//        {
//            System.out.println(strNew[i]+" "+index[i]);
////            System.out.println(str3+"  "+N);
//        }

    }
}
