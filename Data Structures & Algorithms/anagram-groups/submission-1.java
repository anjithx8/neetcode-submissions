class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
         return new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            String freq = FreqMap(str);
        if(map.containsKey(freq)){
            map.get(freq).add(str);
        }
        else{
            List<String> strlist= new ArrayList<>();
            strlist.add(str);
            map.put(freq,strlist);
        }
        }
        return new ArrayList<>(map.values());
    }
    private String FreqMap(String str){
        int[] frequency= new int[26];
        for(char c:str.toCharArray()){
            frequency[c-'a']++;
        }
        StringBuilder string=new StringBuilder("");
        char c='a';
        for(int i: frequency){
            string.append(c);
            string.append(i);
            c++;
        }
        return string.toString();
    }
}
