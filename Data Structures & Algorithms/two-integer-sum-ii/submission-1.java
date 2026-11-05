class Solution {
    //int target = 3;
    //int[] numbers = {1,2,3,4};
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int pointerOne = 0;
        int pointerTwo = numbers.length-1;
        while (pointerOne<=pointerTwo){
            if(pointerOne<pointerTwo && pointerOne!=pointerTwo){
                sum = numbers[pointerOne] + numbers[pointerTwo];
                if(sum > target){
                    pointerTwo--;
                } else if(sum < target) {
                pointerOne++;
                } else{
                    return new int[]{pointerOne+1,pointerTwo+1};
                }
            }
            
        }
        return new int[]{pointerOne+1,pointerTwo+1};
    }
}

