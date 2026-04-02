class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr_s= s.toCharArray();
        Arrays.sort(arr_s);

        char[] arr_t= t.toCharArray();
        Arrays.sort(arr_t);

        return Arrays.equals(arr_s,arr_t);
        // return same; // true

    }

}
