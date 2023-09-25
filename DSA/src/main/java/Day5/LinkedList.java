package Day5;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFisrt(int x){
        Node tmp = new Node(x);
        tmp.setNext(head);
        head = tmp;
        size++;
    }

    public void addLast(int x){
        Node tmp = new Node(x);
        Node j = head;
        while (true){
            if (j == null){
                break;
            }
            j = j.getNext();
        }
    }

    public void display(){
        System.out.print("Linked list: ");
        Node j = null;
        for (int i = 0; i < size; i++){
            if (j == null) j = head;
            System.out.print(j + " ");
            j = j.getNext();
        }
        System.out.println();
    }
}
