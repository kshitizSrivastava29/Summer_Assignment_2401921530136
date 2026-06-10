class Solution {
    public String decodeString(String s) {
        // More optimised by using StringBuilder for curr instead of String
        StringBuilder curr = new StringBuilder("");
        int num = 0;
        // Using two stack
        Stack<Integer> countSt = new Stack<>();
        Stack<String> stringSt = new Stack<>(); 
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c-'0');
            }
            else if(c == '['){
               countSt.push(num);
               num = 0;
               stringSt.push(curr.toString());
               curr = new StringBuilder("");

            }else if( c == ']'){
              StringBuilder sb = new StringBuilder(stringSt.pop());
              int n = countSt.pop();
              for(int i = 0 ; i < n ; i++)sb.append(curr);
              curr = new StringBuilder(sb.toString());
            }else{
              curr.append(c);
            }
        }
        return curr.toString();
    }
}
