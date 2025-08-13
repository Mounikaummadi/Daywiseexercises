
let cities = ["Hyderabad", "Mumbai", "Delhi", "Chennai", "Bengaluru", "Kolkata"];

function loadCities() {
  let dropdown = document.getElementById("cityDropdown");
  dropdown.innerHTML = '<option value="">-- Select a City --</option>';
  let sortedCities = cities.slice().sort();
  sortedCities.forEach(city => {
    let option = document.createElement("option");
    option.value = city;
    option.textContent = city;
    dropdown.appendChild(option);
  });
}
