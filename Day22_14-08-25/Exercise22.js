var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (item) {
        this.items.push(item);
    };
    Stack.prototype.pop = function () {
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        return this.items[this.items.length - 1];
    };
    Stack.prototype.isEmpty = function () {
        return this.items.length === 0;
    };
    Stack.prototype.size = function () {
        return this.items.length;
    };
    return Stack;
}());
var numberStack = new Stack();
numberStack.push(10);
numberStack.push(20);
console.log(numberStack.peek()); // 20
console.log(numberStack.pop()); // 20
console.log(numberStack.pop()); // 10
console.log(numberStack.pop()); // undefined
