public class Solution {
    static String timeConversion(String s) {

        // only have to convert hour and print the rest 
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
          if (s.endsWith("PM"))
              hour += 12;
          return String.format("%02d", hour) + s.substring(2, 8);
      }
  
}