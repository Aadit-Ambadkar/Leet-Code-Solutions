class Problem7_1 {
	public int reverse(int x) {
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
	}
}

//OR

class Problem7_2 {
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
