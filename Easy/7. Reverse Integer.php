class Solution {

    /**
     * @param Integer $x
     * @return Integer
     */
    function reverse($x) 
    {
        $str = strval($x);
        if(strlen($str) == 1) 
        {
            return $str;
        }
        while(strrpos($str,"0") == strlen($str)-1) 
        {
            $str =  substr($str, 0, strlen($str)-1);   
            if(strlen($str) == 1) 
            {
                return $str;
            }
        }
        if (strpos($str,"-") !== false) 
        {
            $str = ltrim($str, "-");
            $strrev = (int)strrev($str);
            if(is_numeric($strrev)) 
            {
                if(is_int($strrev)) 
                {                    
                    if($strrev <= 2147483647 && $strrev >= -2147483648)                    
                    {
                        return "-" . $strrev;                    
                    }
                    else 
                    {
                        return 0;
                    }
                }
                else 
                {
                    return 0;    
                }
               
            }
            else {
                return 0;
            }
            //return "-" . strrev($str);
        }
        else {   
            $strrev = (int)strrev($str);
            if(is_numeric($strrev)) 
            {
                if(is_int($strrev)) 
                {                    
                    if($strrev <= 2147483647 && $strrev >= -2147483648)                    
                    {
                        return $strrev;                    
                    }
                    else 
                    {
                        return 0;
                    }
                }
                else 
                {
                    return 0;    
                }
               
            }
            else {
                return 0;
            }
            
        }
        
    }
}

/*It's also possible to cut down on code duplication, but it increases runtime from 4ms to 17ms*/
/*
class Solution {

    /**
     * @param Integer $x
     * @return Integer
     */
    function reverse($x) 
    {
        $str = strval($x);
        if(strlen($str) == 1) 
        {
            return $str;
        }
        while(strrpos($str,"0") == strlen($str)-1) 
        {
            $str =  substr($str, 0, strlen($str)-1);   
            if(strlen($str) == 1) 
            {
                return $str;
            }
        }
        $isNegative = false;
        if (strpos($str,"-") !== false) 
        {
            $str = ltrim($str, "-");
            $isNegative = true;            
        }
        
        $strrev = (int)strrev($str);
        if(is_numeric($strrev)) 
        {
            if(is_int($strrev)) 
            {                    
                if($strrev <= 2147483647 && $strrev >= -2147483648)                    
                {
                    if($isNegative) 
                    {
                        return '-'.$strrev;    
                    }
                    else {
                        return $strrev;
                    }                                    
                }
                else 
                {
                    return 0;
                }
            }
            else 
            {
                return 0;    
            }
           
        }
        else {
            return 0;
        }
    }
}
*/