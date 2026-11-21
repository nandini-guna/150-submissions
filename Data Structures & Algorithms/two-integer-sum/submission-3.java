class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimize
        HashMap<Integer, Integer> seen = new HashMap<>(); // value, index

        for (int i = 0; i < nums.length; i++){
            int toFind = target - nums[i];

            if (seen.containsKey(toFind)){
                return new int[] {seen.get(toFind), i};
            }

            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}
