public class Solution  {

public static int diagonalDifference(List<List<Integer>> arr) {

    int leftDiagonal = 0;
    int rightDiagonal = 0;
    int col = arr.get(0).size() - 1;

    for(int i= 0; i<arr.get(0).size(); i++){
        leftDiagonal += arr.get(i).get(i);
        rightDiagonal += arr.get(i).get(col);
        col--;
    }

return (int) (Math.abs(leftDiagonal - rightDiagonal));
}

}
}
