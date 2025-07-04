//  https://leetcode.com/problems/remove-outermost-parentheses/description/

class Solution {
    public String removeOuterParentheses(String s) {
        

        StringBuilder result = new StringBuilder();

        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '('){
                count++;
                if(count>1){
                    result.append("(");
                }
            }
            else if(c == ')'){
                if(count>1){
                    result.append(")");
                }
                count--;
            }
        }
        return result.toString();
    }
}