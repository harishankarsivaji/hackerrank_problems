public class Solution {
    static int birthdayCakeCandles(int[] ar) {
        int max = 0;
        int count = 0;

        for( int candle : ar ){
            if (candle > max){
                max = candle;
                count = 1;
            }else if (max == candle) {
                count ++;
            }
        }
        return count;
    }
}