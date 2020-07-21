import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input = sc.next();
            System.out.println(checkInput(input));
		}
		
	}

    private static boolean checkInput(String str) {
        Stack<Character> stk = new Stack<Character>();
        char[] ch = str.toCharArray();
        
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                stk.push(c);
            } else {
                if (c == ']' && !stk.isEmpty() && stk.pop() == '[') {
                    continue;
                } else if (c == '}' && !stk.isEmpty() && stk.pop() == '{') {
                    continue;
                } else if (c == ')' && !stk.isEmpty() && stk.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}