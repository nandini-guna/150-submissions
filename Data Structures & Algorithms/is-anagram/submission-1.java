class Solution {
    public boolean isAnagram(String s, String t) {
        // idea = since order don't matter; compare char count
        HashMap<Character, Integer> first = new HashMap<>();

        for (char i: s.toCharArray()){
            // put replace whole records
            first.put(i, first.getOrDefault(i, 0) + 1);
        }

        for (char j: t.toCharArray()){
            if (first.containsKey(j)){
                // reduce value for this key
                int value = first.getOrDefault(j, 0) - 1;
                first.put(j, value);
                if (value < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        for (int count: first.values()){
            if (count != 0){
                return false;
            }
        }

        return true;
    }
}
