import java.util.*;
class Solution {
    public int compress(char[] chars) {
       if(chars.length == 0)return 0;
        StringBuilder ans = new StringBuilder("");
        int num = 1;
        for(int i = 1; i < chars.length ; i++){
            if(chars[i] == chars[i-1]){
                num++;
            }else{
                ans.append(chars[i-1]);
                if(num > 1){
                    ans.append(Integer.toString(num));
                    num = 1;
                }
            }
        }
        ans.append(chars[chars.length-1]);
        if(num != 1){
            ans.append(Integer.toString(num));
        }
        int x = 0;
        for(int i = 0 ; i < ans.length() ; i++){
            chars[x++] = ans.charAt(i);
        }
        return ans.length();
    }
}
