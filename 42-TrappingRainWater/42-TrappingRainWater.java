// Last updated: 8/3/2025, 10:44:49 PM
class Solution {

    int[] leftMax;
    int[] rightMax;

     void buildleftMax(int[] height,int s){ 

        leftMax = new int[s];
        leftMax[0]=height[0];
        for(int i=1;i<s;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
       

        
    }
      void buildrightMax(int[] height,int s){ 
    rightMax = new int[s];
        rightMax[s-1]=height[s-1];
        for(int i=s-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
         
}

    public int trap(int[] height) {
        int sum=0;
        int s = height.length;
         buildrightMax(height,s);
         buildleftMax(height,s);

        for(int i=0;i<height.length-1;i++){ 
            sum=sum+Math.min(leftMax[i],rightMax[i])-height[i];
        }

        return sum;
    } 
}