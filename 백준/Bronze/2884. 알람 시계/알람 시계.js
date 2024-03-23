const input = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);

const [h, m] = input;

if (m < 45) {
    if (h === 0) {
        console.log(h + 23, 60 - 45 + m);
    } else {
        console.log(h - 1, 60 - 45 + m);
    }
} else {
    console.log(h, m - 45);
}