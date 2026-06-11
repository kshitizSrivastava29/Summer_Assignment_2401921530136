// 1.Every palindrome has a center — either one character (odd length, e.g. "aba") or between two characters (even length, e.g. "abba").
// 2.For each index i, treat it as:
//    Center (i, i) for odd-length palindromes.
//    Center (i, i+1) for even-length palindromes.
// 3.Expand outward while the left and right characters are equal, thereby finding the longest palindrome for that center.
// 4.Keep track of the longest palindrome found across all centers and return it at the end.
// Complexity: O(n²) time, O(1) extra space.

class Solution {
    String ans = "";
    void expand(String s , int i , int j){
        if( i < 0 || j >= s.length())return;
        if(s.charAt(i) != s.charAt(j))return;
        if(s.charAt(i) == s.charAt(j) && s.substring(i,j+1).length() > ans.length())ans = s.substring(i,j+1);
        expand(s,i-1,j+1);
    }
    public String longestPalindrome(String s) {
        for(int i = 0 ; i < s.length() ; i++){
            expand(s,i,i);
            if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
            expand(s,i,i+1);
            }
        }
        return ans;
    }
}
