class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int left=0;
        int right=len-1;
        int []result;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(numbers[left]+numbers[right]<target){
                left+=1;
            }
            else if(numbers[left]+numbers[right]>target){
                right-=1;
            }
        }
        return new int[]{-1,-1};

        
    }
}
