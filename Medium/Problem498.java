//Speed: 2ms (faster than 96.19% of all solutions)
//Memory: 41.7mb (less than 70.04% of all solutions)

//Diagonal Traverse Solution (logic below):

class Problem498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        boolean flag = true;
        int[] fin = new int[matrix.length*matrix[0].length];
        int i = 0;
        int j = 0;
        int imax = matrix.length-1;
        int jmax = matrix[0].length-1;
        int ctr = 0;
        while (true) {
            if (i==imax && j==jmax) {
                fin[ctr] = matrix[i][j];
                break;
            }
            fin[ctr] = matrix[i][j];
            
            if (flag){
                if (j == jmax) {
                    flag = false;
                    i++;
                } else if (i == 0) {
                    flag = false;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == imax) {
                    flag = true;
                    j++;
                } else if (j == 0) {
                    flag = true;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
            ctr++;
        }
        return fin;
    }
}

//Logic:
//We set a flag to check whether we travel up and right, or down and left (up and right is true in this case)
//Next, we loop through martix.length*matrix[0].length times (the total number of elements), and perform the following
//  1) If we are at the end (bottom right of the matrix), log our position and break
//  2) Log our position
//  3) If we are going up and right then:
//    a) If we are at the right side of the matrix then set the flag to false and go down one row
//    b) Else if we are at the top of the matrix then set the flag to false and go right one column
//    c) Else (we are in the middle somewhere) go up one row and right one column
//  4) Else:
//    a) If we are at the bottom of the matrix then set the flag to false and go right one column
//    b) Else if we are at the left side of the matrix then set the flag to false and go down one row
//    c) Else (we are in the middle somewhere) go down one row and left one column
//Finally, return our log of positions.

//This solution works in O(m*n) time
