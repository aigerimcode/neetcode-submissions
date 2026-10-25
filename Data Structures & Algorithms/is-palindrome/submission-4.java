class Solution {
    String s = "Was it a car or a cat I saw?";
    public boolean isPalindrome(String s) {
    boolean isPalindrom = false;
    
    String s1= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    char[] chars = s1.toCharArray();
    int pointerOne = 0;
    int pointerLast = chars.length-1;
    if(s1.isBlank() == true || s1.length() ==1){
        isPalindrom = true;
    }
    while(pointerOne<pointerLast){
        if(chars[pointerOne] == chars[pointerLast]){
            pointerOne++;
            pointerLast--;
            isPalindrom = true;
        } else {
            isPalindrom = false;
            break;
        }
    }
    return isPalindrom;
    }
}
