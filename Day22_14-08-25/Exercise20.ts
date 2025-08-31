
function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

const result1 = pair<number, string>(42, "Answer");
const result2 = pair<boolean, string>(true, "Success");
const result3 = pair<string, string>("Hello", "World");

console.log("Result 1:", result1); 
console.log("Result 2:", result2); 
console.log("Result 3:", result3); 