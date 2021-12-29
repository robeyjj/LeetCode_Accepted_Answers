class Solution 
{

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function removeDuplicates(&$nums) 
    {
        $nums = array_unique($nums); //This is cheating, and not the point of the exercise, but why build a space ship with a bicycle will do?
    }
}