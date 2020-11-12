//Speed: 1ms (faster than 99.19% of all solutions)
//Memory: 37.1mb (less than 14.42% of all solutions)

//Valid Parentheses (logic below):

import java.util.*;
import java.io.*;

class Problem20 {
    public boolean isValid(String s) {
        LinkedList<Character> q = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                q.add(0, ch);
            } else {
                if (q.isEmpty()) {
                  return false;  
                } if (ch==')' && q.peek()=='(') {
                    q.poll();
                } else if (ch=='}' && q.peek()=='{') {
                    q.poll();
                } else if (ch==']' && q.peek()=='[') {
                    q.poll();
                } else {
                    return false;
                }
            }
        }
        if (q.isEmpty()) return true;
        else return false;
    }
}

//Logic:

//1) First, we iterate through each character in the string. If the character is an open parentheses (of any form), then we append it to our queue (at the top). Otherwise, 
//   we check if the closing parentheses is of the same type as the previous opening parentheses. If it is, we pop the first element (opening parentheses) off of the queue.
//   If it is not, then we return false, since the code broke, we had a set of mis-matching parenthesis.
//   *The reason this works is because if we have an open closed parentheses set, we remove it. Hence, if we have {[]}, then first our queue will look like so:
//       1) ['{']
//       2) ['{', '[']
//       3) ['{'] (The closing ']' was found)
//       4) [] (The closing '}' was found)
//2) Now, if all of this succeeds, we still have to make sure that each opened parenthesis was closed. Hence, we make sure that our queue is empty. If it is, we return true.
//   Otherwise, we have unclosed parentheses and we return false.
