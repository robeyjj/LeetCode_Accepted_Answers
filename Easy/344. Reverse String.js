/*Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"

Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
*/

/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
    var sBackwardsString = "";
    for (var i = s.length-1; i >=0; i--){
        sBackwardsString += s[i];
    }
    return sBackwardsString;
};
