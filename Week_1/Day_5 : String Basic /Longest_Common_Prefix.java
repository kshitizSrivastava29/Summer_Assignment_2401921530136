class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans = "";
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int n = s1.length();
        for(int i = 0 ; i < n ; i++){
            if(s1.charAt(i) != s2.charAt(i))break;
            ans += s1.charAt(i);
        }
        return ans;
    }
}
