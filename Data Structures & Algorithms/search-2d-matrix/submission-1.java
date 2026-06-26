class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0,right=matrix.length-1,mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(target>matrix[mid][matrix[0].length-1]){
                left=mid+1;
            }
            else if(target<matrix[mid][0]){
                right=mid-1;
            }
            else 
            {
                int innerleft=0,innerright=matrix[0].length-1,innermid=0;
                while(innerleft<=innerright){
                    innermid=(innerleft+innerright)/2;
                    if(target==matrix[mid][innermid]){
                        return true;
                    }
                    else if(target>matrix[mid][innermid]){
                        innerleft=innermid+1;
                    }
                    else if(target<matrix[mid][innermid]){
                        innerright=innermid-1;
                    }
                
                }
                return false;
            }

        }
        return false;
    }
}
