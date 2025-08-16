import User from './user.js';

const userIdInput = document.getElementById("userId");
const passwordInput = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
const logoutBtn = document.getElementById("logoutBtn");
const status = document.getElementById("status");

if (localStorage.getItem("userId")) {
    status.textContent = `Logged in as: ${localStorage.getItem("userId")}`;
} else {
    status.textContent = "Not logged in";
}
loginBtn.addEventListener("click", () => {
    const userId = userIdInput.value.trim();
    const password = passwordInput.value.trim();

    if (userId && password) {
        const user = new User(userId, password);
        localStorage.setItem("userId", user.getUserId());
        status.textContent = `Logged in as: ${user.getUserId()}`;
        alert("Login successful!");
    } else {
        alert("Please enter both User ID and Password");
    }
});

logoutBtn.addEventListener("click", () => {
    localStorage.removeItem("userId");
    status.textContent = "Not logged in";
    alert("Logged out successfully!");
});
