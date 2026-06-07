class Solution {
    boolean check(String s1 , String s2){
        int[] ch = new int[26];
        for(char c : s1.toCharArray()){
            ch[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            ch[c-'a']--;
        }
         
        for(int i = 0 ; i< 26 ; i++){
            if(ch[i] != 0)return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length() > s2.length())return false;
       int n = s1.length();
       for(int i = 0 ; i <= s2.length() - n ; i++){
          if(check(s1,s2.substring(i,i+n)))return true;
       }
       return false;
    }
}
