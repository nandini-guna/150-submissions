class Solution {
    public boolean isAnagram(String s, String t) {
        // Optimized Solution: only possible to use array since all letters 
        // are lowercase. Else, hashMap.

        // when t is longer than s
        if (s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        for (int i =0; i < s.length(); i++) {
            // -a for normalization to fit in array size we set
            // add count when match for s
            count[s.charAt(i) - 'a']++;
            // minus count when match for 
            count[t.charAt(i) - 'a']--;
        }

        // when s is longer than t + anagram means all char = 0 after loop
        for (int c: count){
            if (c != 0){
                return false;
            }
        }
        return true;
    }
}
