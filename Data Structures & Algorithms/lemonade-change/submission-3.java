class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5=0,bill10=0,bill20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                bill5+=5;
            }
            else if(bills[i]==10){
                if(bill5>=5){
                 bill10+=bills[i];
                 bill5-=5;}
                else return false;
                }
            else if(bills[i]==20){
                if(bill5>=5&&bill10>=10){
                    bill20+=bills[i];
                    bill5-=5;
                    bill10-=10;
                } 
                else if(bill5>=15){
                    bill20+=bills[i];
                    bill5-=15;}
                else return false;
            }
            }
        
        return true;
    }
}