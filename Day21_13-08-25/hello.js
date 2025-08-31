function addValues(x,y) {
            console.log(x+y);
}
addValues(5,4);
function changeText(){
   document.getElementById("heading").innerText = "New Text";
}
document.addEventListener("DOMContentLoaded", function () {
  var input = document.getElementById("textInput");
  var button = document.getElementById("checkBtn");
  var output = document.getElementById("output");

  if (button) {
    button.addEventListener("click", function () {
      var textLength = input.value.length;
      output.innerText = "Length of input: " + textLength;
    });
  } else {
    console.error("Button element not found");
  }
});
document.addEventListener("DOMContentLoaded", function () {
  var input = document.getElementById("textInput");
  var label = document.getElementById("charLabel");

  input.addEventListener("input", function () {
    var remaining = 50 - input.value.length;
    label.innerText = remaining + " characters remaining";
  });
});
