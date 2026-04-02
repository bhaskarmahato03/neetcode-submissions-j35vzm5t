class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;          // fixed: length is a property, not a method
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j < n; j++) {   // declared j
                if (j != i) {
                    temp = temp * nums[j];
                }
            }
            result[i] = temp;
        }

        return result;
    }
}
