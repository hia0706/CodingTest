const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const A = input[0];
const B = input[1];
const C = input[2];

console.log(A + B + C);