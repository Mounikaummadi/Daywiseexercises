
let names = ["Nikhi", "Mounika", "Anu", "Poojaaa", "Sai", "Michael"];
let longNames = names.filter(function(name) {
    return name.length > 5;
});
let upperCaseNames = longNames.map(function(name) {
    return name.toUpperCase();
});
console.log("Original Names:", names);
console.log("Long Names (Uppercase):", upperCaseNames);
