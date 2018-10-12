/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

 

Note:

 1.   1 <= A.length <= 5000
 2.   0 <= A[i] <= 5000
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int min = 0;
        int max = A.length - 1;
        int tempInt;
        while (min < max){
            if(A[min] % 2 == 0){
                min++;  
            }
            else {
                tempInt = A[min];
                A[min] = A[max];
                A[max] = tempInt;
                max--;
            }            
        }        
        return A;
    }
}
//Runtime beats 99.94% of java submissions.