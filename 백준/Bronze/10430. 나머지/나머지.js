const input = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);

const A = input[0];
const B = input[1];
const C = input[2];

console.log( (A+B)%C );
console.log( ((A%C) + (B%C))%C );
console.log( (A*B)%C );
console.log( ((A%C) * (B%C))%C );