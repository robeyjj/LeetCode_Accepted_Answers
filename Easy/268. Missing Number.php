class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function missingNumber($nums) {
        sort($nums);
        if(!in_array(0, $nums)) {
            return 0;
        }
        if(count($nums) == 1 && $nums[0] == 0) {            
            return 1;                                
        }
        for($x = 0; $x < count($nums); $x++) {
            if($nums[$x]+1 != $nums[$x+1]) {
                return $nums[$x]+1;
            }
        }
    }
}