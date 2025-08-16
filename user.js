export default class User {
    constructor(userId, password) {
        this.userId = userId;
        this.password = password;
    }

    getUserId() {
        return this.userId;
    }
}
