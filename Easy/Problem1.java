class Problem1_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int anti = target-nums[i];
            if (m.containsKey(anti) && m.get(anti) != i) return new int[]{m.get(anti), i};
            m.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

//OR

class Problem1_2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
