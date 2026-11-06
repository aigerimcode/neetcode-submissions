class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        while(last>=0){ 
            if(digits[last]<9){
                digits[last] = digits[last] + 1;
                return digits;
            } else if (digits[last]==9){
                digits[last] = 0;
                last--;
            }
        }   
        if(last<0){
            int[] temp = new int[digits.length+1];
            temp[0]=1;
            for(int i=0;i<digits.length;i++){
                temp[i+1] = digits[i];
                
            }
            return temp;
        }   
        return digits;
    }
}