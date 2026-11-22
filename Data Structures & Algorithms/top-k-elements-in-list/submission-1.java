class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // return top k freq element (descending order)
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num: nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(count.entrySet());
        // sort by descending order
        entries.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
