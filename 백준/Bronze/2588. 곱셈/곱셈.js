const input = require('fs').readFileSync('/dev/stdin').toString().split('\n').map(Number);

const oneNum=input[1]%10;
const tenNum=Math.floor((input[1]%100)/10);
const hundredNum=Math.floor(input[1]/100);

console.log(input[0]*oneNum);
console.log(input[0]*tenNum);
console.log(input[0]*hundredNum);
console.log(input[0]*input[1]);