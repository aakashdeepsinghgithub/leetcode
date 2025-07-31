// Last updated: 7/31/2025, 7:56:04 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        
       n= n^(n >> 1);

        int result = n & (n+1) ;
        return result==0 ?  true : false;
        
    }
}