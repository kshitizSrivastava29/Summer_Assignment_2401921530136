class Solution {
    void reverse(char[] s,int sIdx,int eIdx){
        while(sIdx <= eIdx){
            char temp = s[sIdx];
            s[sIdx] = s[eIdx];
            s[eIdx] = temp;
            sIdx++;
            eIdx--;
        }
    }
    public String reverseWords(String s) {
        // inplace reserve
        char[] str = s.toCharArray();
        int sIdx = 0;
        for(int i = 0 ; i <= str.length ; i++){
            if(i == str.length || str[i] == ' '){
               reverse(str,sIdx,i-1);
               sIdx = i+1 ;
            }
        }
        return new String(str); // To directly convert char array into string , make an object of String
    }
}
