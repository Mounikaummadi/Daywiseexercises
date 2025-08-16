
function sumNumbers(...nums) {
    return nums.reduce((total, num) => total + num, 0);
}
const total = sumNumbers(1, 2, 3, 4, 5, 10);

document.getElementById("output").textContent =
    `Sum of numbers is: ${total}`;

console.log("Sum:", total);
