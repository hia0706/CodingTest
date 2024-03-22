const input = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);

const year = input[0];

// 윤년
if (year%4 === 0 && year%100 !== 0 || year%400 === 0) {
    console.log(1);
} else {
// 윤년 아닐 때
    console.log(0);
}