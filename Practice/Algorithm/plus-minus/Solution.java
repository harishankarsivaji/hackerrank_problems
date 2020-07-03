public class Solution {
    static void plusMinus(int[] arr) {
        int len = arr.length;
        float positive = 0;
        float negative = 0;
        float zeros = 0;

        for (int i=0; i<len; i++){
            int element = arr[i];
            if (element > 0) {
                positive += 1;
            }
            if (element < 0) {
                negative++;
            }
            if (element ==0) {
                zeros++;
            }
        }

        System.out.printf("%f \n", positive/len);
        System.out.printf("%f \n", negative/len);
        System.out.printf("%f \n", zeros/len);

    }

}