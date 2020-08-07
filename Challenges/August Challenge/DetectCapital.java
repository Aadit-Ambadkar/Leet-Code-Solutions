//Speed: 1ms (Better than 99.51% of all solutions)
//Memory: 38mb (Better than 62.19% of all solutions)

class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) return true;
        if (word.charAt(0) == (word.toLowerCase()).charAt(0)) return false;
        for (int i = 1; i<word.length(); i++) {
            if (word.charAt(i) == (word.toUpperCase()).charAt(i)) return false;
        }
        return true;
    }
}
