class Solution {
    boolean check(String s1 , String s2){
        int[] ch = new int[26];
        for(char c : s1.toCharArray()){
            ch[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            ch[c-'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(ch[i] != 0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length())return ans;
        int n = p.length();
        for(int i = 0 ; i <= s.length() - n ; i++){
            if(check(p,s.substring(i,i+n)))ans.add(i);
        }
        return ans;
    }
}
