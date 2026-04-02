class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length;
        int i=0;
        int j=len-1;
        int max_val=0;
        int curr;
        while(i<j){
            curr=(j-i)*Math.min(heights[i],heights[j]);
            if(curr>max_val){
                max_val=curr;

            }
            else{
                if (heights[i]<heights[j]){
                    i+=1;
                }
                else{
                    j-=1;
                }
            }
        }
        return max_val;
        
    }
}
