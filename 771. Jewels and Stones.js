/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
    var totalJewels = 0;
    var i;
    for(i = 0; i < S.length; i++) {
        if(J.indexOf(S.charAt(i)) > -1) {
            totalJewels++;
        }
    }
    return totalJewels;
};

/*Your runtime beats 98.78 % of javascript submissions.*/