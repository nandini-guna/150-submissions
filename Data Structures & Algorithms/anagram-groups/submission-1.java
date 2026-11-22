class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Optimized Version
        HashMap<String, List<String>> result = new HashMap<>();

        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); //cat >> act

            result.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(result.values());
    }
}
