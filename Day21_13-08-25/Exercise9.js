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
    age: 13,
    city: "Chennai",
  },
];
// for(let i=0;i<persons.length;i++){
//     if(persons[i].age>=18){
//         persons[i].isAdult="Yes"
//     }else{
//         persons[i].isAdult="No"
//     }
// }
let result = persons.map(person => {
  let status;
  if (person.age >= 18) {
    status = "Adult";
  } else {
    status = "Minor";
  }

  return {
    ...person,
    status: status
  };
});

console.log(result);
