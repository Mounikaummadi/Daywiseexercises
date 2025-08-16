
function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) {
        return "Error: Division by zero is not allowed";
    }
    return a / b;
}

let num1 = 10;
let num2 = 5;

let multiplicationResult = multiply(num1, num2);
let divisionResult = divide(num1, num2);
let divisionByZeroResult = divide(num1, 0);
document.getElementById("output").innerHTML = `
Multiplication: ${num1} × ${num2} = ${multiplicationResult} <br>
Division: ${num1} ÷ ${num2} = ${divisionResult} <br>
Division by zero: ${divisionByZeroResult}
`;


console.log("Multiply:", multiplicationResult);
console.log("Divide:", divisionResult);
console.log("Divide by zero:", divisionByZeroResult);
