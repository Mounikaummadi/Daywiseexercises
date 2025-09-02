function validateEmail() {
    const email=document.getElementById(email).Value.trim();
    const emailError=document.getElementById(emailError);
    const emailRegex=/^[^\s@]+[^\s@]+\.+[\s@]+$./;
    if(email===""){
        emailError.textContent="Email required";
        return false;
    }else if (!emailRegex.test(email)) {
    emailError.textContent = "Please enter a valid email address.";
    return false;
    }else {
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

 function login() {
    const isEmailValid = validateEmail();
    const isPasswordValid = validatePassword();

    if (isEmailValid && isPasswordValid) {
      const email = document.getElementById("email").value.trim();
      localStorage.setItem("userId", email);
      document.getElementById("status").textContent = `Logged in as ${email}`;
    } else {
      document.getElementById("status").textContent = "";
    }
  }

  function logout() {
    localStorage.removeItem("userId");
    document.getElementById("status").textContent = "Logged out";
  }

  window.onload = function () {
    const storedUser = localStorage.getItem("userId");
    if (storedUser) {
      document.getElementById("status").textContent = `Logged in as ${storedUser}`;
    }
  };