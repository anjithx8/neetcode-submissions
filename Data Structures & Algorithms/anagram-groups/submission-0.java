class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
            return new ArrayList<>();
        
        Map<String,List <String>> FStringMap= new HashMap<>();
        for (String str:strs)
        {
        String FString = getFrequencyString(str);
        if(FStringMap.containsKey(FString))
        {
            FStringMap.get(FString).add(str);
        }
        else
        {
        List<String> strList = new ArrayList<>();
        strList.add(str);
        FStringMap.put(FString,strList);
        }
        }
            return new ArrayList<>(FStringMap.values());

    }
    private String getFrequencyString(String str)
    {
        int[] freq = new int[26];
        for(char c :str.toCharArray()){
            freq[c-'a']++;

        }
        StringBuilder Fstring = new StringBuilder("");
        char c='a';
        for(int i :freq)
        {
            Fstring.append(c);
            Fstring.append(i);
            c++;
        }
        return Fstring.toString();
    }
}
