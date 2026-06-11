class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            List<String> l = map.getOrDefault(temp,new ArrayList<>());
            l.add(s);
            map.put(temp,l);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> e : map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}
