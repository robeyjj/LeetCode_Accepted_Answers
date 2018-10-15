//Incredibly slow n^2 solution.

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] daysToWait = new int[T.length];
                
        for(int i = 0; i < T.length; i++) {
            for(int j = i + 1; j < T.length; j++) {
                if(T[j] > T[i]) {
                    daysToWait[i] = j - i;
                    break;
                }                
            }
        }
        return daysToWait;
    }
}