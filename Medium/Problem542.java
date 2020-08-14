//Speed: 8ms (faster than 90.21% of all solutions)
//Memory: 43mb (less than 58.59% of all solutions)

//01 Matrix Solution (logic below):

class Problem542 {
    public int[][] updateMatrix(int[][] matrix) {
		if (matrix.length==0) return matrix;
		int[][] fin = new int[matrix.length][matrix[0].length];
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) fin[i][j] = 0;
                else fin[i][j] = 10_000;
            }
        }
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[0].length; j++) {
                if (fin[i][j] == 0) continue;
                if (i==0&&i==matrix.length-1&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = 0;
                } else if (i==0&&i==matrix.length-1&&j==0) {
                    fin[i][j] = fin[i][j+1]+1;
                } else if (i==matrix.length-1&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i-1][j]+1;
                } else if (i==0&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i+1][j]+1;
                } else if (i==0&&i==matrix.length-1&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i][j-1]+1;
                } else if (i==0&&i==matrix.length-1) {
                    fin[i][j] = Math.min(fin[i][j+1], fin[i][j-1])+1;
                } else if (j==0&&j==matrix[0].length-1) {
                    fin[i][j] = Math.min(fin[i-1][j], fin[i+1][j])+1;                    
                } else if (i==0 && j==0) {
                    fin[i][j]=Math.min(fin[i+1][j], fin[i][j+1])+1;
                } else if (i==matrix.length-1 && j==0) {
                    fin[i][j]=Math.min(fin[i-1][j], fin[i][j+1])+1;
                } else if (i==0 && j==matrix[0].length-1) {
                    fin[i][j]=Math.min(fin[i+1][j],fin[i][j-1])+1;
                } else if (i==matrix.length-1 && j == matrix[0].length-1) {
                    fin[i][j]=Math.min(fin[i-1][j],fin[i][j-1])+1;
                } else if (i==0) {
                    fin[i][j]=Math.min(Math.min(fin[i][j-1],fin[i][j+1]), fin[i+1][j])+1;
                } else if (j==0) {
                    fin[i][j]=Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j+1])+1;
                } else if (i==matrix.length-1) {
                    fin[i][j]=Math.min(Math.min(fin[i][j-1],fin[i][j+1]), fin[i-1][j])+1;
                } else if (j==matrix[0].length-1) {
                    fin[i][j]=Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j-1])+1;
                } else {
                    fin[i][j]=Math.min(Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j-1]), fin[i][j+1])+1;
                }
                
            }
        }
        for (int i = matrix.length-1; i>=0; i--) {
            for (int j = matrix[0].length-1; j>=0; j--) {
                if (fin[i][j] == 0) continue;
                if (i==0&&i==matrix.length-1&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = 0;
                } else if (i==0&&i==matrix.length-1&&j==0) {
                    fin[i][j] = fin[i][j+1]+1;
                } else if (i==matrix.length-1&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i-1][j]+1;
                } else if (i==0&&j==0&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i+1][j]+1;
                } else if (i==0&&i==matrix.length-1&&j==matrix[0].length-1) {
                    fin[i][j] = fin[i][j-1]+1;
                } else if (i==0&&i==matrix.length-1) {
                    fin[i][j] = Math.min(fin[i][j+1], fin[i][j-1])+1;
                } else if (j==0&&j==matrix[0].length-1) {
                    fin[i][j] = Math.min(fin[i-1][j], fin[i+1][j])+1;                    
                } else if (i==0 && j==0) {
                    fin[i][j]=Math.min(fin[i+1][j], fin[i][j+1])+1;
                } else if (i==matrix.length-1 && j==0) {
                    fin[i][j]=Math.min(fin[i-1][j], fin[i][j+1])+1;
                } else if (i==0 && j==matrix[0].length-1) {
                    fin[i][j]=Math.min(fin[i+1][j],fin[i][j-1])+1;
                } else if (i==matrix.length-1 && j == matrix[0].length-1) {
                    fin[i][j]=Math.min(fin[i-1][j],fin[i][j-1])+1;
                } else if (i==0) {
                    fin[i][j]=Math.min(Math.min(fin[i][j-1],fin[i][j+1]), fin[i+1][j])+1;
                } else if (j==0) {
                    fin[i][j]=Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j+1])+1;
                } else if (i==matrix.length-1) {
                    fin[i][j]=Math.min(Math.min(fin[i][j-1],fin[i][j+1]), fin[i-1][j])+1;
                } else if (j==matrix[0].length-1) {
                    fin[i][j]=Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j-1])+1;
                } else {
                    fin[i][j]=Math.min(Math.min(Math.min(fin[i-1][j],fin[i+1][j]), fin[i][j-1]), fin[i][j+1])+1;
                }
                
            }
        }
        return fin;
	  }
}

//Logic:
//Use Dynamic Programming to store the distances. Each 0 has a distance of 0, and we set each 1 to have a distance of 10,000 (initially). Then, we check each position and its 
//neighbors to get the correct value of that position (if it is a 1). However, we have to also loop backwards to go from both angles, and so we do so. Return output.

//Runs in O(r*c) time and O(1) space without considering the output array, since no additional data structures for computations. Otherwise, this runs in O(r*c) space.
