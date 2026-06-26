class Solution {
    public int longestConsecutive(int[] nums) {
        int longestnum = 0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int num:nums){
            map.put(num,Boolean.FALSE);
        }

        for (int num:nums){
            int currentLength =1;
            int nextnum = num+1;
            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                currentLength++;
                map.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            int prevnum = num-1;
            while(map.containsKey(prevnum)&& map.get(prevnum)==false){
                currentLength++;
                map.put(prevnum,Boolean.TRUE);
                prevnum--;
            }
            longestnum= Math.max(longestnum,currentLength);
        
        }
        return longestnum;
    }
}
