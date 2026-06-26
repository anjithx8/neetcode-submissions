class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().trim();
        int l = s.length();

        int left=0;
        int right = l - 1;

        while(left<right){
            
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            
            else{
                return false;
            }

        }
        return true;
    }

}
