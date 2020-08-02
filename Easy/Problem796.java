import java.util.*;

class Problem796 {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()) return false;
        if (A.equals(B)) return true;
        ArrayList<Character> a = new ArrayList<Character>();
        ArrayList<Character> b = new ArrayList<Character>();
        for (int i = 0; i<A.length(); i++) {
            a.add(A.charAt(i));
            b.add(B.charAt(i));
        }
        for (int i = 0; i<A.length(); i++) {
            Collections.rotate(a, 1);
            if (a.equals(b)) return true;
        }
        return false;
    }
}
