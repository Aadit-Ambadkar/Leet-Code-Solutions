class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (reverse(x)==x) return true;
        return false;
    }
    public int reverse(int x) {
        try {
            if (x < 0) {
                x = 0-x;
                String xString = Integer.toString(x);
                StringBuilder inp = new StringBuilder();
                inp.append(xString);
                inp = inp.reverse();
                xString = inp.toString();
                x = Integer.parseInt(xString);
                return 0-x;
            } else {
                String xString = Integer.toString(x);
                StringBuilder inp = new StringBuilder();
                inp.append(xString);
                inp = inp.reverse();
                xString = inp.toString();
                x = Integer.parseInt(xString);
                return x;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
	}    
}
