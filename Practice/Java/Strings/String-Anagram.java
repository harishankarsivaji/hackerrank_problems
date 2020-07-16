import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        //Check length of the 2 strings 
        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.toLowerCase().charAt(i);
                b = b.toLowerCase();
                if (b.indexOf(ch) != -1) {
                    b = b.replaceFirst(ch + "", "");
                } else {
                    return false;
                }
            }
            return b.length() == 0;
        }
    }
}