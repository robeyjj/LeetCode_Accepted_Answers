/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:

    'A' : Absent.
    'L' : Late.
    'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:

Input: "PPALLP"
Output: True

Example 2:

Input: "PPALLL"
Output: False
*/
class Solution {
    public boolean checkRecord(String s) {
        int aCounter = 0;
        int lCounter = 0;
        char[] cArray = s.toCharArray();
        for(char c : cArray) {
            if(c == 'P'){
                lCounter = 0;
            }
            if(c == 'A') {                
                aCounter++;
                if(aCounter > 1) {
                    return false;
                }
                lCounter = 0;
                continue;
            }
            if(c == 'L') {
                lCounter++;
                if(lCounter > 2) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
}
//Solution runtime beats 98.89% of java submissions.