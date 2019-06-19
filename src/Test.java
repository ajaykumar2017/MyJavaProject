import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

class Test {
    public static void main(String[] args) throws Exception {
        int totalLeters = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitted = input.split("\\s+");
        int length = splitted.length;
        for (int start = 1; start < length; start++) {
            if (start != length - 1 && start!=1) {
                if (Integer.valueOf(splitted[start]) == 0 &&
                        Integer.valueOf(splitted[start - 1]) != 0 && Integer.valueOf(splitted[start + 1]) != 0) {
                    totalLeters = totalLeters + (Integer.valueOf(splitted[start - 1]) < Integer.valueOf(splitted[start + 1])?Integer.valueOf(splitted[start - 1]):Integer.valueOf(splitted[start + 1]));
                }
            }
            if (start == length - 1) {
                totalLeters = totalLeters + Integer.valueOf(splitted[start]);
            }
            if (start==1){
                totalLeters = totalLeters + Integer.valueOf(splitted[start]);
            }
        }
        System.out.println(totalLeters);

    }
}