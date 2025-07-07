

//question: check anagram

import java.util.*;

public class groupAnagrem 
{
    public static void main(String[] args) 
    {
        String s = "cbaebabacd";
        String p = "abc";

        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) 
         {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int windowSize = p.length();
        List<Integer> result = new ArrayList<>();

        while (right < s.length()) 
        {
            char rightChar = s.charAt(right);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

          
            if (right - left + 1 > windowSize) 
            {
                char leftChar = s.charAt(left);
                if (windowMap.get(leftChar) == 1) 
                {
                    windowMap.remove(leftChar);
                } else 
                {
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                left++;   
            }


            if (right - left + 1 == windowSize) 
            {
                if (windowMap.equals(pMap)) 
                {
                    result.add(left);
                }
            }
            right++; 
        }

        System.out.println("Anagram indices: " + result);
    }
}