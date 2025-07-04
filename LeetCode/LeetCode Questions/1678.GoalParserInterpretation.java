
//https://leetcode.com/problems/goal-parser-interpretation/description/



class Solution {
    public String interpret(String command) {
        
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if(c == 'G') {
                result.append("G");
            }
            else if(c == '(') {
                if(i + 1 < command.length() && command.charAt(i + 1) == ')') {
                    result.append("o");
                    i++; // Skip the closing parenthesis
                } else {
                    result.append("al");
                    i += 3; // Skip "al)"
                }
            }
        }
        
        return result.toString();
    }
}