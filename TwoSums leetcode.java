class Solution {
    public int[] twoSum(int[] nums, int target) {
        //()&&
        //int [] arr = new int[2];
        //int set =0;
        
        HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length;i++){
            
            if (! hp.containsKey(target-nums[i])){
                hp.put(nums[i],i);
            }
            else{
                return new int[]{i, hp.get(target-nums[i])};
                
            }
        }
        return new int[]{0};
    }
}
