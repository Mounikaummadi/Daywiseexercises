
let persons = [
    { name: "Ram", age: 17, city: "Hyderabad" },
    { name: "sweety", age: 22, city: "Vijayawada" },
    { name: "Anu", age: 19, city: "Delhi" },
    { name: "Pooji", age: 15, city: "Chennai" },
    { name: "Sai", age: 25, city: "Mumbai" }
];

let eligibleVoters = persons.filter(function(person) {
    return person.age >= 18;
});

console.log("All Persons:", persons);
console.log("Eligible Voters:", eligibleVoters);
