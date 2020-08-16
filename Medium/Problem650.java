//Speed: 0ms (faster than 100% of all solutions)
//Memory: 36mb (less than 94.93% of all solutions)

//2 Keys Keyboard Solution (Logic below):

class Problem650 {
    public int minSteps(int n) {
        if (n==1) return 0;
        return minSteps(n/div(n))+div(n);
    }
    public int div(int n) {
        for (int i = 2; i<=n; i++) {
            if (n%i==0) return i;
        }
        return n;
    }
}

//Logic:
//We work backwards, trying to divide the final string into as little pieces as possible.

//First, if the number is 1, return 0.
//Otherwise, we return minSteps of the largest divisor (not equal to n) of n. However, we have to add n/largest_divisor_of_n minus 1 for each paste, 
//and we have to add 1 for the copy keystroke. So, we add n/largest_divisor_of_n.
//We calculate the largest divisor of n with a simple loop.

//This solution works in O(n) time and O(1) space.
