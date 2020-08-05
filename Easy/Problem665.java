class Problem665 {
    public boolean checkPossibility(int[] nums) {
        int ret = 0;
        for (int i = (nums.length-1); i>0; i--) {
            if (nums[i] < nums[i-1])  {
                ret++;
                if (i!=nums.length-1) {
                    if (nums[i-1] >nums[i+1]) nums[i-1]=nums[i];
                    else nums[i]=nums[i-1];
                }
                else nums[i]=nums[i-1];
            }
            if (ret>1) return false;
        }
        return true;
    }
}
//Speed: 1ms
//Space: 40.8 mb
