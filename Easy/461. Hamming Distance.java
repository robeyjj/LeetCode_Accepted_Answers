/* 
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
 0 ≤ x, y < 2^31. 

Example: 
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/

class Solution {
    public int hammingDistance(int x, int y) {
        //Convert ints to 32 bit binary value representations
        String xBinaryString = String.format("%32s", Integer.toBinaryString(x)).replace(' ','0');
        String yBinaryString = String.format("%32s", Integer.toBinaryString(y)).replace(' ','0');   
        
        //Value for counting distance
        int hammingCount = 0;
        
        //Analyze each "bit" character        
        for(int i = 0; i < 32; i++) {           
            if(xBinaryString.charAt(i) != yBinaryString.charAt(i)) {
                hammingCount++;
            }
        }
        return hammingCount;
    }
}
