class Problem29 {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else return -dividend;
        }
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) return 1;
            return 0;
        }

        int count = 0;
    
        if (dividend > 0 && divisor > 0) {
            while (dividend - divisor >= 0) {
                dividend -= divisor;
                count++;
            }
        } else if (dividend < 0 && divisor < 0) {
            while (dividend - divisor <= 0) {
                dividend -= divisor;
                count++;
            }
        } else if (dividend > 0 && divisor < 0) {
            while (dividend + divisor >= 0) {
                dividend += divisor;
                count--;
            }
        } else if (dividend < 0 && divisor > 0) {
            while (dividend + divisor <= 0) {
                dividend += divisor;
                count--;
            }
        }

        return count;
    }
}
