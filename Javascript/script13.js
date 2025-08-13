function validateEmail() {
  let emailValue = document.getElementById("email").value.trim();
  let emailError = document.getElementById("emailError");

  if (emailValue === "") {
    emailError.textContent = "Email is required";
    emailError.style.visibility = "visible";
  } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(emailValue)) {
    emailError.textContent = "Invalid email format";
    emailError.style.visibility = "visible";
  } else {
    emailError.style.visibility = "hidden";
  }
}

function validatePassword() {
  let passwordValue = document.getElementById("password").value.trim();
  let passwordError = document.getElementById("passwordError");

  if (passwordValue === "") {
    passwordError.textContent = "Password is required";
    passwordError.style.visibility = "visible";
  } else {
    passwordError.style.visibility = "hidden";
  }
}

function validateLogin() {
  validateEmail();
  validatePassword();

  let emailErrorVisible = document.getElementById("emailError").style.visibility === "visible";
  let passwordErrorVisible = document.getElementById("passwordError").style.visibility === "visible";

  if (!emailErrorVisible && !passwordErrorVisible) {
    alert("Login successful!");
  }
}
