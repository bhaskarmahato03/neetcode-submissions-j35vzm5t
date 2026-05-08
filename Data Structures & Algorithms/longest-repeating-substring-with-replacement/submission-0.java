class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            // Update the frequency of the current character
            count[s.charAt(r) - 'A']++;
            // Update the max frequency found in the current window
            maxFreq = Math.max(maxFreq, count[s.charAt(r) - 'A']);

            // If (window size - max frequency) > k, the window is invalid
            while ((r - l + 1) - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            // Update the result with the maximum valid window size found
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}