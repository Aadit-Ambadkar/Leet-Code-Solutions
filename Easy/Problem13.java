class Problem13 {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
    
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1) {
                sum+=m.get(s.charAt(i));
                break;
            }
            if (s.charAt(i) == 'I') {
                if (s.charAt(i+1) == 'V') {
                    sum+=4;
                    i++;
                    continue;
                }
                if (s.charAt(i+1) == 'X') {
                    sum+=9;
                    i++;
                    continue;
                }
                sum+=1;
            }
            if (s.charAt(i) == 'X') {
                if (s.charAt(i+1) == 'L') {
                    sum+=40;
                    i++;
                    continue;
                }
                if (s.charAt(i+1) == 'C') {
                    sum+=90;
                    i++;
                    continue;
                }
                sum+=10;
            }
            if (s.charAt(i) == 'C') {
                if (s.charAt(i+1) == 'D') {
                    sum+=400;
                    i++;
                    continue;
                }
                if (s.charAt(i+1) == 'M') {
                    sum+=900;
                    i++;
                    continue;
                }
                sum+=100;
            }
            if (s.charAt(i) == 'V') sum+=5;
            if (s.charAt(i) == 'L') sum+=50;
            if (s.charAt(i) == 'D') sum+=500;
            if (s.charAt(i) == 'M') sum+=1000;
            System.out.println(sum);
        }
        return sum;
    }
}
