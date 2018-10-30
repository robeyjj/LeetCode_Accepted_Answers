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
        String topRow = "QWERTYUIOPqwertyuiop";
        String midRow = "ASDFGHJKLasdfghjkl";
        String botRow = "ZXCVBNMzxcvbnm";
        boolean containsTop = false;
        boolean containsMid = false;
        boolean containsBot = false;
        ArrayList<String> returnWords = new ArrayList<String>();
        int counter = 0;
        
                
        for(String word : words) {
            if(word.length() == 1){
                returnWords.add(word);
                continue;
            }
            containsTop = containsMid = containsBot = false;
            counter = 0;
            for(char c : word.toCharArray()) {
                if(topRow.indexOf(c) > -1) {
                    containsTop = true;
                    counter++;
                    if(containsMid || containsBot) {                       
                        break;
                    }
                    if(counter == word.length()) {
                        returnWords.add(word); 
                    }
                }
                if(midRow.indexOf(c) > -1) {
                    containsMid = true;
                    counter++;
                    if(containsTop || containsBot){                        
                        break;
                    }
                    if(counter == word.length() ) {
                        returnWords.add(word);
                    }
                }
                if(botRow.indexOf(c) > -1) {
                    containsBot = true;
                    counter++;
                    if(containsTop || containsMid) {                        
                        break;
                    }
                    if(counter == word.length()) {
                        returnWords.add(word);
                    }
                }
            }         
        }
        return returnWords.toArray(new String[returnWords.size()]);
    }
}
//Solution runtime beats 100% of java submissions!