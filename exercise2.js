
const doubleNumbers = (arr) => arr.map(num => num * 2);
const numbers = [1, 2, 3, 4];
const doubled = doubleNumbers(numbers);
document.getElementById("result").textContent = "Doubled array: " + doubled;
console.log("Doubled array:", doubled);
