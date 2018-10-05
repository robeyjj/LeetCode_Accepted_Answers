/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

class Solution {
    public int romanToInt(String s) {
        //If there's no numerals then the total is zero
        if (s.length() == 0) {
            return 0;
        }
         
        // Create a HashMap to store Roman Numeral values
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        
        //Initialize the counter to get the integer sum
        int numeralCounter = 0;
        
        //Count through the numerals
        for (int i = 0; i < s.length(); i++) {
            //If the current numeral is smaller than the following numeral, subtract it
            if (i <= s.length() - 2 && hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                numeralCounter -= hashMap.get(s.charAt(i));
            //Otherwise add the numeral's value to the total
            } else {
                numeralCounter += hashMap.get(s.charAt(i));
            }
        }
        return numeralCounter;
    }
}