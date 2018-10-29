/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of an American keyboard.
 

Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

 

Note:

    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.
*/
class Solution {
    public String[] findWords(String[] words) {
          List<String> returnWords = new ArrayList<>();
          for (String s : words)
                if (s.matches("[QWERTYUIOPqwertyuiop]+|[ASDFGHJKLasdfghjkl]+|[ZXCVBNMzxcvbnm]+"))
                      returnWords.add(s);
          return returnWords.toArray(new String[0]);
    }
}
//Today we learned RegEx's are extremely slow