
import java.util.*;
class Main {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        char[] chararr=input.toCharArray();
        int length=chararr.length;
        if(areParenthesisBalanced(chararr))
            System.out.println("true");
        else
            System.out.println("false");

// 		while (sc.hasNext()) {

//             //Complete the code

// 		}
    }
    static boolean isMatchingPair(char character1,char character2){
        if(character1=='('&&character2==')')
            return true;
        if(character1=='{'&&character2=='}')
            return true;
        if(character1=='['&&character2==']')
            return true;
        else
            return false;
    }

    static boolean areParenthesisBalanced(char chararr[])
    {
        Stack st=new Stack<>();
        for (int i=0;i<chararr.length ;i++ )
        {
            if (chararr[i]=='{'||chararr[i]=='('||chararr[i]=='[')
                st.push(chararr[i]);
            if (chararr[i]=='}'||chararr[i]==')'||chararr[i]==']')
            {
                if(st.isEmpty())
                {
                    return false;
                }
//                else if(!isMatchingPair(st.pop()),chararr[i])
//                {
//                    return false;
//                }
            }
            st.push(chararr[i]);

        }
        if(st.isEmpty())
            return true;
        else{
            return false;
        }

    }

}


