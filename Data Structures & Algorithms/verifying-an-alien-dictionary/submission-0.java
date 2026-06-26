class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];
    boolean foundDifference = false;
        for(int j=0;j<Math.min(word1.length(),word2.length());j++){
            int rank1=map.get(word1.charAt(j));
            int rank2=map.get(word2.charAt(j));
            if(rank1>rank2){ foundDifference = true;
            return false;}
            else if(rank1==rank2){ continue;}
            else if(rank1<rank2) { foundDifference=true;
                break;}
        }
            if(foundDifference==false&&word1.length()>word2.length()) return false;

        }
        return true;
    }
}