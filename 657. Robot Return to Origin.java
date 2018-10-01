class Solution {
    public boolean judgeCircle(String moves) {
        int upCount = 0;
        int downCount = 0;
        int leftCount = 0;
        int rightCount = 0;             
        
        for(char c : moves.toCharArray()) {            
            switch(c) {
                case 'U': upCount++;
                    break;
                case 'D': downCount++;
                    break;
                case 'L': leftCount++;
                    break;
                case 'R': rightCount++;
                    break;
                default: break;
            }
        }
        if((upCount - downCount == 0) && (leftCount - rightCount == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}