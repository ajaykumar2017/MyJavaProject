import java.util.*;
public class AliAndHelpingInnocentPeople {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String input=s.next();
        checkValidOrNot(input);
    }

    private static void checkValidOrNot(String str)
    {
        if(str.length() != 9)
        {
            System.out.println("length is bigger");
        }
        else{
            char let=str.charAt(2);
            char hyp=str.charAt(6);
            if(!Character.isDigit(str.charAt(0))||!Character.isDigit(str.charAt(1))
                    ||!Character.isDigit(str.charAt(3))||!Character.isDigit(str.charAt(4))
                    ||!Character.isDigit(str.charAt(5))||!Character.isDigit(str.charAt(7))
                    ||!Character.isDigit(str.charAt(8)))
            {
                System.out.println("invalid");
            }
            else if(!Character.isUpperCase(let))
            {
                System.out.println("invalid");
            }
            else if(hyp!='-')
            {
                System.out.println("invalid");
            }
            else{
                int d1=Character.getNumericValue(str.charAt(0));
                int d2=Character.getNumericValue(str.charAt(1));
                int d4=Character.getNumericValue(str.charAt(3));
                int d5=Character.getNumericValue(str.charAt(4));
                int d6=Character.getNumericValue(str.charAt(5));
                int d8=Character.getNumericValue(str.charAt(7));
                int d9=Character.getNumericValue(str.charAt(8));
                if(!((d1+d2)%2==0)||!((d4+d5)%2==0)||!((d5+d6)%2==0)||!((d8+d9)%2==0))
                {
                    System.out.println("invalid");
                }
                else if(let=='A'||let=='E'||let=='I'||let=='O'||let=='U'||let=='Y') {
                    System.out.println("invalid");
                }
                else{
                    System.out.println("valid");
                }
            }
        }
    }
}
