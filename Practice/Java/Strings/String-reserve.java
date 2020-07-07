
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean pal = true;

        int i = 0, j = A.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (A.charAt(i) != A.charAt(j)) 
                pal = false; 
            
            i++; 
            j--; 
        } 
  
        
        System.out.println(pal ? "Yes" : "No");
        
    }
}