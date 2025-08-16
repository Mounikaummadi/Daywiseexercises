
class Util {
    
    static getDate() {
        const today = new Date();
        const dd = String(today.getDate()).padStart(2, '0');
        const mm = String(today.getMonth() + 1).padStart(2, '0'); // Month is 0-indexed
        const yyyy = today.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }

    static getPIValue() {
        return Math.PI;
    }

    static convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }

    static getFibonacci(n) {
        const fib = [];
        for (let i = 0; i < n; i++) {
            if (i === 0) fib.push(0);
            else if (i === 1) fib.push(1);
            else fib.push(fib[i-1] + fib[i-2]);
        }
        return fib;
    }
}
const outputDiv = document.getElementById("output");

let outputText = '';
outputText += `Today's Date: ${Util.getDate()}<br>`;
outputText += `Value of PI: ${Util.getPIValue()}<br>`;
outputText += `25°C in Fahrenheit: ${Util.convertC2F(25)}°F<br>`;
outputText += `First 5 Fibonacci numbers: ${Util.getFibonacci(5).join(', ')}<br>`;

outputDiv.innerHTML = outputText;
console.log("Today's Date:", Util.getDate());
console.log("Value of PI:", Util.getPIValue());
console.log("25°C in Fahrenheit:", Util.convertC2F(25));
console.log("First 5 Fibonacci numbers:", Util.getFibonacci(5));
