
const numbers = [1, 2, 3, 4, 5];

const sumArray = (arr) => arr.reduce((acc, curr) => acc + curr, 0);

const total = sumArray(numbers);

document.getElementById("result").textContent = "The sum of the array is: " + total;

console.log("The sum of the array is:", total);
