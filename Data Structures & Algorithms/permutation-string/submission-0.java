class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // Store frequency of s1
        for(char ch : s1.toCharArray()) {
            s1Map.put(ch, s1Map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        // Expand window
        for(int right = 0; right < s2.length(); right++) {

            char newChar = s2.charAt(right);

            // Add new character to window
            windowMap.put(newChar,
                    windowMap.getOrDefault(newChar, 0) + 1);

            // Keep window size equal to s1.length()
            if(right - left + 1 > s1.length()) {

                char oldChar = s2.charAt(left);

                windowMap.put(oldChar,
                        windowMap.get(oldChar) - 1);

                // Remove key if frequency becomes 0
                if(windowMap.get(oldChar) == 0) {
                    windowMap.remove(oldChar);
                }

                left++;
            }

            // Compare maps
            if(windowMap.equals(s1Map)) {
                return true;
            }
        }

        return false;
    }
}