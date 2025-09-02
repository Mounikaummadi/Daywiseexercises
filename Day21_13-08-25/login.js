function validateEmail() {
  const email = document.getElementById("email").value.trim();
  const emailError = document.getElementById("emailError");
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (email === "") {
    emailError.textContent = "Email is required.";
    return false;
  } else if (!emailRegex.test(email)) {
    emailError.textContent = "Please enter a valid email address.";
    return false;
  } else {
    emailError.textContent = "";
    return true;
  }
}

function validatePassword() {
  const password = document.getElementById("password").value.trim();
  const passwordError = document.getElementById("passwordError");

  if (password === "") {
    passwordError.textContent = "Password is required.";
    return false;
  } else {
    passwordError.textContent = "";
    return true;
  }
}

function validateForm() {
  const isEmailValid = validateEmail();
  const isPasswordValid = validatePassword();

  if (isEmailValid && isPasswordValid) {
    alert("Login successful!");
    // You can proceed with form submission or API call here
  }
}