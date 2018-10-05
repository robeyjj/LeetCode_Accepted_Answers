/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
Input: "Hello"
Output: "hello"

Example 2:
Input: "here"
Output: "here"

Example 3:
Input: "LOVELY"
Output: "lovely"
*/

class Solution {
    public String toLowerCase(String str) {
        StringBuilder newStr = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                c += ('a' - 'A');
            }
            newStr.append(c);
        }
        return newStr.toString();
    }
}

//A somewhat cheesy answer but it's important to know what tools you have available to you
/*
class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
*/