
class Box<T> {
    private value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

const numberBox = new Box<number>(36);
console.log("Number Box:", numberBox.getValue());

const stringBox = new Box<string>("TypeScript");
console.log("String Box:", stringBox.getValue());

const booleanBox = new Box<boolean>(true);
console.log("Boolean Box:", booleanBox.getValue());