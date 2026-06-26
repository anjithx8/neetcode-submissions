class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> Intset= new HashSet<>();
        for (int num : nums){
            if(Intset.contains(num)){
                return true;
            }
            Intset.add(num);
        }
        return false;

}
}
