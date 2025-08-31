class Stack<T> {
  private items: T[] = [];

  push(item: T): void {
    this.items.push(item);
  }


  pop(): T | undefined {
    return this.items.pop();
  }

  peek(): T | undefined {
    return this.items[this.items.length - 1];
  }

  isEmpty(): boolean {
    return this.items.length === 0;
  }

  size(): number {
    return this.items.length;
  }
}
const numberStack = new Stack<number>();
numberStack.push(10);
numberStack.push(20);
console.log(numberStack.peek()); // 20
console.log(numberStack.pop());  // 20
console.log(numberStack.pop());  // 10
console.log(numberStack.pop());  // undefined
