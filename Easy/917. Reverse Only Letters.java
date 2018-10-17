/*
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"

Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

 

Note:

    S.length <= 100
    33 <= S[i].ASCIIcode <= 122 
    S doesn't contain \ or "

*/
class Solution {
    public String reverseOnlyLetters(String S) {
        char temp;
        StringBuilder sb = new StringBuilder(S);        
        int leftSide = 0;
        int rightSide = sb.length() - 1;
        
        while(leftSide < rightSide) {
            while((leftSide < rightSide) && !Character.isLetter(sb.charAt(leftSide))) {
                leftSide++;
            }
            while((leftSide < rightSide) && !Character.isLetter(sb.charAt(rightSide))) {
                rightSide--;
            }            
            temp = sb.charAt(leftSide);
            sb.setCharAt(leftSide, sb.charAt(rightSide));
            sb.setCharAt(rightSide, temp);
            leftSide++;
            rightSide--;               
        }
        return sb.toString();
    }
}
//Solution runtime beats 99.92% of java submissions.