class Solution {
    
    void generate(int n , int n1 , int n2 , StringBuilder sb,List<String> list ){
        // n1 ==> count of '('
        //  n2 ==> count of ')'
        if(n2 == n){
            list.add(sb.toString());
            return;
        }
        if(n1 > n2){
            generate(n,n1,n2+1,sb.append(')'),list);
            sb.delete(sb.length()-1,sb.length());
            if(n1 < n){
             generate(n,n1+1,n2,sb.append('('),list);
             sb.delete(sb.length()-1,sb.length());
            }
        }else{
            generate(n,n1+1,n2,sb.append('('),list);
            sb.delete(sb.length()-1,sb.length());
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,0,0,new StringBuilder(""),list);
        return list;
    }
}
