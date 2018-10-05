/*Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"

Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
*/

class Solution {
    public String reverseString(String s) {
        char[] sCharArray = s.toCharArray();
        char temp;
        for(int i =0; i < sCharArray.length / 2; i++) {
            temp = sCharArray[i];
            sCharArray[i] = sCharArray[sCharArray.length - i - 1];
            sCharArray[sCharArray.length - i - 1] = temp;
        }
        return String.valueOf(sCharArray);
    }
}