class Solution {
    public boolean isPalindrome(String s) {
        String cleanString= s.replaceAll("[^a-zA-Z0-9]", "");
        String lowercase =cleanString.toLowerCase();
        int len=lowercase.length();
        int left=0;
        int right=len-1;

        while(left<right){
            if (lowercase.charAt(left) != lowercase.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
    return true;
        
    }
}
