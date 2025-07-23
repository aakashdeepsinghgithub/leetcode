// Last updated: 7/23/2025, 5:27:08 PM
class Solution {
    boolean[] array= new boolean[5*(int)1e6  + 10];
    Solution(){ 

        
        int n =array.length-1;
        for(int i=2;i*i<n;i++){ 
            if(array[i]==false){ 
               for(int j=i*i;j<=n;j+=i){ 
                array[j]=true;
               } 
            }
        }
       
    }
    public int countPrimes(int n) {
        if(n==1) return 0;
        if(n==0) return 0;
        int ctr=0;
        for(int i=2;i<n;i++){ 
            if(array[i]==false){
                ctr++;
            } 
        }
        return ctr;
        
    }
}