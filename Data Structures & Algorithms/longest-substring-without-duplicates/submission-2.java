class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int res = 0;

        for (int right = 0; right < s.length(); right++) {
            // If we find a duplicate, shrink the window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character and update result
            charSet.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}