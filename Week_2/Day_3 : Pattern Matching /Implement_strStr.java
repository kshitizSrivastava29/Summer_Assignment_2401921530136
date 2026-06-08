class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length(); 
        for(int i = 0 ; i <= haystack.length() - n ; i++){
            if(needle.compareTo(haystack.substring(i,i+n)) == 0)return i;
        }
        return -1;
    }
}
