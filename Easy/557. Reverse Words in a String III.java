class Solution {
    public String reverseWords(String s) { 
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        StringBuffer tempString = new StringBuffer("");
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                tempString = new StringBuffer(s.substring(counter,i));
                tempString = tempString.reverse();
                sb.append(tempString + " ");
                counter = i+1; 
            }
            if(i == s.length() - 1) {
                tempString = new StringBuffer(s.substring(counter,i+1));
                tempString = tempString.reverse();
                sb.append(tempString);
                counter = i+1; 
            }          
        }
        return sb.toString();
    }
}
//Better solution. Solution runtime beats 50.39% of Java submissions.