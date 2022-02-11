const vowels = new Set();
vowels.add("a");
vowels.add("e");
vowels.add("i");
vowels.add("o");
vowels.add("u");
console.log(vowels);

const getVowelSubstring = (str) => {
    let arr = str.split("");
    let result = [];
    let targetIndexes = [];
    let isFinalTarget = true;

    for(let i = 0; i < arr.length; i++){
       
        if (vowels.has(arr[i].toLowerCase())) {
            targetIndexes.push(i);
            if (isFinalTarget) {
                result.push(str[i]);
                isFinalTarget = false;
            } else {
                targetIndexes.map((x) => result.push(str.substring(i, x + 1)));
            }
        }
            
    }
    return result.sort();
}

const getConsonantSubstring = (str) => {
    let arr = str.split("");
    let result = [];
    let targetIndexes = [];
    let isFinalTarget = true;

    for(let i = 0; i < arr.length; i++){
       
        if (!(vowels.has(arr[i].toLowerCase()))) {
            targetIndexes.push(i);
            if (isFinalTarget) {
                result.push(str[i]);
                isFinalTarget = false;
            } else {
                targetIndexes.map((x) => result.push(str.substring(i, x + 1)));
            }
        }
            
    }
    return result.sort();
}

const redundant = (str) => {
    return () => {
        return str;
    }
}

console.log(getVowelSubstring("hello"))
console.log(getVowelSubstring("hmm"))
console.log(getConsonantSubstring("aviation"))

console.log(redundant("apple"))
