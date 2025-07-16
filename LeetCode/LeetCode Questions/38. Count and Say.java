//  https://leetcode.com/problems/count-and-say/description/?envType=problem-list-v2&envId=string


class Solution {
    public String countAndSay(int n) {
        
        if(n<=0){
            return "";
        }
        String result = "1";
        for(int i=2;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int c = 1;
            char ch = result.charAt(0);

            for(int j=1;j<result.length();j++){
                if(result.charAt(j) == ch){
                    c++;
                }
                else{
                    sb.append(c).append(ch);
                    c = 1;
                    ch = result.charAt(j);
                }
            }
            sb.append(c).append(ch);
            result = sb.toString();
        }
        
        return result;
    }
}