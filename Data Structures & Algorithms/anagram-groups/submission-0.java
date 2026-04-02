

class Solution {

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        int n = strs.length;

        
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {

            if (arr1[i] == 1)
                continue;

            List<String> currentGroup = new ArrayList<>();

            for (int j = i; j < n; j++) {
                if (arr1[j] == 0 && isAnagram(strs[i], strs[j])) {
                    currentGroup.add(strs[j]);
                    arr1[j] = 1;
                }
            }

            res.add(currentGroup);
        }

        return res;
    }
}
