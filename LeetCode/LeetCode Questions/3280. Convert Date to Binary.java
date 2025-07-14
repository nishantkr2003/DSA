//https://leetcode.com/problems/convert-date-to-binary/description/


class Solution {
    public String convertDateToBinary(String date) {
        // String[] s = date.split("-");

        // int y = Integer.parseInt(s[0]);
        // int m = Integer.parseInt(s[1]);
        // int d = Integer.parseInt(s[2]);

        // String yb = Integer.toBinaryString(y);
        // String mb = Integer.toBinaryString(m);
        // String db = Integer.toBinaryString(d);

        // return yb + "-" + mb + "-" + db; 


        return Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))) + "-" +
               Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))) + "-" +
               Integer.toBinaryString(Integer.parseInt(date.substring(8)));

        
    }


    
}