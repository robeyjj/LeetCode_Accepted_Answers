class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) 
    {
        for($x = 0; $x < count($nums); $x++) 
        {
            for($y = $x+1; $y <= count($nums); $y++) 
            {
                if($nums[$x] + $nums[$y] == $target) 
                {                
                    return [$x,$y];                
                }            
            }            
        }
    }
}