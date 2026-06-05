class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)return true;
        String str = "";
        for(char c : s.toCharArray()){
            if(('a' <= c && c <= 'z') || ( 'A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))str += c;
        }
        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right))return false;

            left++;
            right--;
        }

        return true;
    }
}
