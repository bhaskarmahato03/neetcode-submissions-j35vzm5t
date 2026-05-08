class Solution {
    public int findMin(int[] nums) {
        int l=nums.length;
        int left =0;
        int right=l-1;

        while(left< right){
            int mid=left + (right-left)/2;
            if(nums[mid]>nums[right]){
            left=mid+1;
            }
            else{
                 right=mid;
            }
        
        }
        return nums[left];
         
        
    }
}
