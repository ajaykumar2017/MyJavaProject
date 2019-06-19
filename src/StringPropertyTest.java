import java.util.*;
public class StringPropertyTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
//        mPostFile.replace(mPostFile.substring(mPostFile.lastIndexOf('.')+1),"")
        String extension=input.substring(input.lastIndexOf('.')+1);
        System.out.println(extension);
        String output=input.replace(input.substring(input.lastIndexOf('.')+1),"");
        System.out.println(output);
        String example = "/abc/def/ghfj.doc";
        System.out.println(example.substring(example.lastIndexOf("/") + 1));
    }
}
