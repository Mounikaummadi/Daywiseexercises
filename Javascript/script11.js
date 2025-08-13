
var date = new Date(2030, 7, 13);
var days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
var dayName = days[date.getDay()];
console.log("13th August 2030 will be a " + dayName);
document.getElementById("result").textContent = "13th August 2030 will be a " + dayName;
