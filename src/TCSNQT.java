import java.time.Month;
import java.util.*;
import java.time.*;
        public class TCSNQT {
            public static void main(String args[]){
                Scanner s=new Scanner(System.in);
                String str=s.next();
                String[] str1=str.split("-");
                if (Integer.parseInt(str1[1])<=12) {
                    if (isLeap(Integer.parseInt(str1[2]))) {
                        int mVal=Integer.parseInt(str1[1]);
                        String mon="";
                        int days=0;
                        switch (mVal)
                        {
                            case 1: mon="January";
                                days=31;
                                break;
                            case 2: mon="February";
                                days=29;
                                break;
                            case 3: mon="March";
                                days=31;
                                break;
                            case 4: mon="April";
                                days=30;
                                break;
                            case 5: mon="May";
                                days=31;
                                break;
                            case 6: mon="June";
                                days=30;
                                break;
                            case 7: mon="July";
                                days=31;
                                break;
                            case 8: mon="August";
                                days=31;
                                break;
                            case 9: mon="September";
                                days=30;
                                break;
                            case 10: mon="October";
                                days=31;
                                break;
                            case 11: mon="November";
                                days=30;
                                break;
                            case 12: mon="December";
                                days=31;
                                break;
                        }
                        System.out.println(mon+" has "+days+" days");
                    }
                    if (!isLeap(Integer.parseInt(str1[2]))) {
                        int mVal=Integer.parseInt(str1[1]);
                        String mon="";
                        int days=0;
                        switch (mVal)
                        {
                            case 1: mon="January";
                                days=31;
                                break;
                            case 2: mon="February";
                                days=28;
                                break;
                            case 3: mon="March";
                                days=31;
                                break;
                            case 4: mon="April";
                                days=30;
                                break;
                            case 5: mon="May";
                                days=31;
                                break;
                            case 6: mon="June";
                                days=30;
                                break;
                            case 7: mon="July";
                                days=31;
                                break;
                            case 8: mon="August";
                                days=31;
                                break;
                            case 9: mon="September";
                                days=30;
                                break;
                            case 10: mon="October";
                                days=31;
                                break;
                            case 11: mon="November";
                                days=30;
                                break;
                            case 12: mon="December";
                                days=31;
                                break;
                        }
                        System.out.println(mon+" has "+days+" days");
                    }
                }
                String mm=Month.of(10).toString();
                String mm1=mm.charAt(0)+mm.substring(1).toLowerCase();
                System.out.println(mm1);
                System.out.println(Year.isLeap(Integer.parseInt(str1[2])));
                System.out.println(isLeap(Integer.parseInt(str1[2])));
            }
            static boolean isLeap(int n)
            {
                boolean l=false;
                if (n%100==0)
                {
                    n=n/100;
                    if (n%4==0)
                        l=true;
                }
                else if (n%4==0)
            l=true;

        return l;
    }
}
