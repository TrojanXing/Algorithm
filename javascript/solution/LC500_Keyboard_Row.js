var findWords = function(words) {
    var reg1 = /^[qwertyuiopQWERTYUIOP]*$/;
    var reg2 = /^[asdfghjklASDFGHJKL]*$/;
    var reg3 = /^[zxcvbnmZXCVBNM]*$/;
    var res = [];
    for(let s of words){
        if( reg1.test(s) || reg2.test(s) || reg3.test(s) ){
            res.push(s);
        }
    }
    return res;
};
