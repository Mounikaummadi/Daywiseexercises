class Util {
    getDate() {
        const today = new Date();
        const dd = String(today.getDate()).padStart(2, '0');
        const mm = String(today.getMonth() + 1).padStart(2, '0');
        const yyyy = today.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }
    getPIValue() {
        return Math.PI;
    }

    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }
    getFibonacci(n) {
        if (n <= 0) return [];
        if (n === 1) return [0];
        const fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
    }
}
const util = new Util();
console.log("Date:", util.getDate());
console.log("PI:", util.getPIValue());
console.log("27°C to F:", util.convertC2F(27));
console.log("Fibonacci numbers:", util.getFibonacci(6));