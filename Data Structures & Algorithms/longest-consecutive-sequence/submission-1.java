class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int max=0;
       for(int num:nums){
        set.add(num);
       } 
       for(int num:nums){
        
        if(!set.contains(num-1)){
            int length=1;
            int current = num;
            while(set.contains(current+1)){
                current+=1;
                length+=1;
            }
        max=Math.max(length,max);
        }
       }
       return max;
    }
}
