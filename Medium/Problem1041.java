//Speed: 0ms (faster than 100% of all solutions)
//Memory: 37.2mb (less than 75.40% of all solutions)

//Robot Bounded in Circle Solution (logic below):

class Problem1041 {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 0;
        for (int i = 0; i<instructions.length(); i++) {
            if (instructions.charAt(i) == 'L') {
                dir = (dir+3)%4;
            } else if (instructions.charAt(i) == 'R') {
                dir = (dir+1)%4;
            } else {
                if (dir == 0) {
                    y++;
                } else if (dir == 1) {
                    x++;
                } else if (dir == 2) {
                    y--;
                } else if (dir == 3) {
                    x--;
                }
            }
        }
        if (x==0 && y==0) return true;
        if (dir == 0) return false;
        return true;
    }
}

//Logic:
//When the problem asks for if the robot is bounded in a circle, it is essentially asking if the robot doesn't travel in one direction for ever.
//In other words, either the robot resets itself at the starting position at the end of the instructions, or it always ends facing a different direction. If the robot
//doesn't do either of these, then it is unbounded. 
//1) To check for direction, we make a direction counter, where 0 is up, 1 is to the right, 2 is down, and 3 is left. If the character at a specific point is 'R' or 'L', 
//   change accordingly. Otherwise, move in the direction we need to. 
//2) Then we check firstly if the robot resets itself (because if so then it is okay if it is still facing the same direction as it started). If so we return true 
//   (it is bounded in some circle). Otherwise, if the robot is in the samedirection as it started, return false. Finally, return true.

//This solution runs in O(instruction.length()) time and O(1) space.
