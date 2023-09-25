package Day2;

public class main {
    public static void main(String[] args) {
        Stack s1 = new Stack(100);
        s1.push(1);
        s1.printStack();

        s1.push(2);
        s1.printStack();

        s1.peek();
        s1.printStack();

        s1.pop();
        s1.printStack();

        s1.push(3);
        s1.printStack();

        s1.push(8);
        s1.printStack();

        s1.peek();
        s1.printStack();

        s1.isFull();
        s1.printStack();

        s1.pop();
        s1.printStack();
    }
}
