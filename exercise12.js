
class User {
    constructor(name) {
        this.name = name;
    }

    getName() {
        return this.name;
    }
}

const user1 = new User("Anu");
document.getElementById("output").textContent = "User Name: " + user1.getName();

console.log("User Name:", user1.getName());



