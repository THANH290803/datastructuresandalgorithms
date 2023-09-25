package Day2;

public class Stack {
    private int top;
    private int capacity;
    private int arr[];

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public boolean isFull(){
        if (top == capacity -1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public boolean push(int x){
        if (isFull() == true){
//            System.out.println("Ngăn xếp đầy, không thể chứa thêm phần tử mới");
            return false;
        }
        else {
            top = top + 1;
            arr[top] = x;
            return true;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Ngăn xếp rỗng");
            System.exit(0);
        }
        else {
            int t = arr[top];
            top = top - 1;
            return t;
        }
        return 0;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Ngăn xếp rỗng");
            System.exit(0);
        }
        else {
            int t = arr[top];
            return t;
        }
        return 0;
    }

    public void  printStack(){
        for (int i = 0; i <= top; i++){
            System.out.printf(arr[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }
}
