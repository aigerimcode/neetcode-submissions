class Solution {
    int[] nums = {3,2,3,5,7,7,8};
    /*      using xor
    public int singleNumber(int[] nums) {
        int first = nums[0];
        for(int i = 1; i<nums.length;i++){
            first = first ^ nums[i];
        }
        return first;
           
    }
    */
    // implemented with HashSet
    public int singleNumber(int[] nums) {
        Set<Integer> someNumbers = new HashSet<>();
        for (int aNumber : nums){
            if (someNumbers.contains(aNumber)){
                someNumbers.remove(aNumber);
            } else {
                someNumbers.add(aNumber);
            }
        }
        return someNumbers.iterator().next();
    }
}
