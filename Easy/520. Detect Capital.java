/*
 Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:

Input: "USA"
Output: True

Example 2:

Input: "FlaG"
Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters. 
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        char[] charArray = word.toCharArray();
        int capitalCounter = 0;
        if(charArray[0] >= 'A' && charArray[0] <= 'Z') {
            for(int i = 1; i < charArray.length; i++) {
                if(charArray[i] >= 'A' && charArray[i] <= 'Z') {
                    capitalCounter++;
                }
            }
            if(capitalCounter > 0 && capitalCounter < word.length() - 1) {
                return false;
            }
            else {
                return true;
            }
        }        
        for(int i = 1; i < charArray.length; i++) {
            if(charArray[i] >= 'A' && charArray[i] <= 'Z') {
                return false;
            }            
        }
        return true;
    }
}