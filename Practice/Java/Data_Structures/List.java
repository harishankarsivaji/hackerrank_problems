import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String op = scan.next();
            if (op.equalsIgnoreCase("INSERT")) {
                int index = scan.nextInt();
                int item = scan.nextInt();
                list.add(index, item);
            } else {
                list.remove(scan.nextInt());
            }

        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        scan.close();
    }
}