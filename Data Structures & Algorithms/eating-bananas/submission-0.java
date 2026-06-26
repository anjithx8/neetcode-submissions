class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0], result=0;
        for(int i =1;i<piles.length;i++){
            if(piles[i]>max)
             max=piles[i];
        }
        int left=1,mid=0;
        while(left<=max){
            mid=(left+max)/2;
            int hours=0;
            for(int i=0; i<=piles.length-1;i++){
                hours+=Math.ceil((double)piles[i]/mid);
            }
             if(h<hours){
                left=mid+1;
                
            }
            else if(h>=hours){
                result =mid;
                max=mid-1;
            }
            
            }
            return result;
        }
        
    }

