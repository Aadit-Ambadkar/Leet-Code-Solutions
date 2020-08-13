//Speed: 0ms (faster than 100% of all solutions)
//Memory: 37.3mb (less than 81.70% of all solutions)

//Spiral Matrix 1 Solution (logic below):

class Problem54 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<Integer>();
        if (matrix[0].length == 0) return new ArrayList<Integer>();
        int j0 = matrix[0].length-1;
        int i1 = matrix.length-1;
        int j2 = 0;
        int i3 = 1;
        int dir = 0;
        int i = 0;
        int j = 0;
        ArrayList<Integer> fin = new ArrayList<>();
        for (int k = 0; k <matrix.length*matrix[0].length; k++) {
            fin.add(matrix[i][j]);
            if (dir == 0) {
                if (j == j0) {
                    j0--;
                    dir = (dir+1)%4;
                    i++;
                } else {
                    j++;
                }
            } else if (dir == 1) {
                if (i == i1) {
                    i1--;
                    dir = (dir+1)%4;
                    j--;
                } else {
                    i++;
                }
            } else if (dir == 2) {
                if (j == j2) {
                    j2++;
                    dir = (dir+1)%4;
                    i--;
                } else {
                    j--;
                }
            } else if (dir == 3) {
                if (i == i3) {
                    i3++;
                    dir = (dir+1)%4;
                    j++;
                } else {
                    i--;
                }
            }
        }
        return fin;
    }
}

//Logic:
//We set a right bound (j0), left bound (j2), an upper bount (i3), and a lower bound (i1). we set our direction to the right. Then we loop through until we hit the right bound.
//Once the right bound is hit, change the direction to down, decrement the right bound, and go down. Then loop through until we hit the bottom bound. At said point we
//decrement the lower bound, change direction to the left, and go left. Loop through till we hit the left bound. At said point we increment the left bound, change directions, 
//and go up, till we reach the top. At said point we increment the upper bound, change directions, and go to the left. Repeat till we reach the end.

//This solution runs in O(m*n) time (fastest possible), and O(1) space without considering the output array, since no additional data structures for computations.
//Else O(m*n) space.
