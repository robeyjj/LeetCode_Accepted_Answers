/*
 A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:

Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int tempNum;
        int remainderNum;
        List<Integer> selfDividers = new ArrayList<Integer>();
        
        for(int i = left; i <= right; i++) {
            tempNum = i;
            while(tempNum >= 0) {
                if(tempNum == 0) {
                    selfDividers.add(i);
                    break;
                }    
                remainderNum = tempNum % 10;
                if(remainderNum == 0) {
                    break;                
                }

                if(i % remainderNum == 0) {
                    tempNum /= 10;                
                }
                else {
                    break;
                }
            }
        }
        return selfDividers;
    }
}
//Runtime beats 72.66% of java submissions