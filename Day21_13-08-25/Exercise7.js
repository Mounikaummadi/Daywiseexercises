var persons=[{
    name:"Badari",
    age: 23,
    city: "Hyderabad",
  },
  {
    name: "Nitheesh",
    age: 23,
    city: "Bangalore",
  },
  {
    name: "Narayana",
    age: 23,
    city: "Chennai",
  },
];
let newlist=persons.filter((person)=>person.age>=18);
console.log(newlist)
