public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (true) {
            String[] str = s.split("[, '@_.?!]+");
            int length = str.length;
            if (str[0].length() == 0 || str[str.length - 1].length() == 0) {
                length--;
            }
            System.out.println(length);
            for (String s1 : str)
                if (s1.length() != 0)
                    System.out.println(s1);
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
