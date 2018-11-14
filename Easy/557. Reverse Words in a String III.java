class Solution {
    public String reverseWords(String s) { 
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        StringBuffer tempString = new StringBuffer("");
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || i == s.length() - 1) {                
                if(s.charAt(i) == ' ') {
                    tempString = new StringBuffer(s.substring(counter,i));
                    tempString = tempString.reverse();
                    sb.append(tempString + " ");
                }
                else {
                    tempString = new StringBuffer(s.substring(counter,i+1));
                    tempString = tempString.reverse();
                    sb.append(tempString);
                }                
                counter = i+1;      
            }
        }
        return sb.toString();
    }
}
//Solution runtime beats 34.66% of Java submissions.