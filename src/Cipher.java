import java.util.*;
public class Cipher {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str=s.next();
        s.nextLine();
        int n=s.nextInt();
        encrypt(n, str);
    }
    static void encrypt(int n, String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='a' && ch[i]<='z'))
            {
                ch[i]=(char)(ch[i]+n);
                if (ch[i]>'z'){
                    ch[i]= (char) (ch[i]-96);
                }
            }
            if((ch[i]>='A' && ch[i]<='Z'))
            {
                ch[i]=(char)(ch[i]+n);
                if (ch[i]>'Z'){
                    ch[i]= (char) (ch[i]-64);
                }
            }
            if(Character.isDigit(ch[i]))
            {
                int temp=(Character.getNumericValue(ch[i])+n)%10;
                ch[i]=Character.forDigit(temp,10);
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
