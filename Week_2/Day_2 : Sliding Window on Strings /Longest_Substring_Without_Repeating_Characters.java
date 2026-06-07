import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int sIdx = 0;
        for(int i = 0 ; i <s.length() ; i++){
            while(!set.isEmpty() && set.contains(s.charAt(i))){
                set.remove(s.charAt(sIdx));
                sIdx++;
            }
        set.add(s.charAt(i));
        ans = Math.max(ans,i-sIdx+1);   
        }
        return ans;
    }
}
