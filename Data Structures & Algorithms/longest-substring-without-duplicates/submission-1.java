class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] Array = s.toCharArray();
        int len = Array.length;
        int Maxwindow = 0;
        for(int i = 0; i < len; i++){
            Set<Character> st = new HashSet<>();
            int current = 0;
            for (int j = i; j < len; j++){
                char temp = Array[j];
                if(st.contains(temp)){
                    break;
                }
                current += 1;
                st.add(temp);
                Maxwindow = Math.max(current, Maxwindow);
            }
        }
        return Maxwindow; 
    }
}