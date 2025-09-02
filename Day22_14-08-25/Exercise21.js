var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(36);
console.log("Number Box:", numberBox.getValue());
var stringBox = new Box("TypeScript");
console.log("String Box:", stringBox.getValue());
var booleanBox = new Box(true);
console.log("Boolean Box:", booleanBox.getValue());
