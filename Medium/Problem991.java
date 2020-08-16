//Speed: 0ms (faster than 100% of all solutions)
//Memory: 36.2mb (less than 65.74% of all solutions)

//Broken Calculator Solution (Logic below):

class Problem991 {
    public int brokenCalc(int x, int y) {
        if (x>=y) return x-y;
        if (y%2==0) return brokenCalc(x,y/2)+1;
        return brokenCalc(x,y+1)+1;
    }
}

//Logic:
//Code is self-explanatory.

//This code runs in O(log Y) time and O(1) space.
