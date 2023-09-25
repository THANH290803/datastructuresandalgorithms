package DoublelikedList;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
        } else {
            // Co it nhat 1 phan tu
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (size == 0) {
            addFirst(data);
        } else {
            // Bước 1: Tạo node mới
            Node newNode = new Node(data);
            // Bước 2: Tìm ra node cuối??
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            // Buoc 3: set next node cuoi -> new node
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);
            // Buoc 4: Tang size len 1 don vi
            size++;
        }
    }

    public void add(int data, int position) {
        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else if (position < 0 || position > size) {
            throw new RuntimeException("Không hợp lệ!");
        } else {
            // Bước 1: Cần tìm node vị trị position -1
            Node previousNode = head;
            for (int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            //
            Node currentNode = previousNode.getNext(); // position

            // Bước 2: Tạo node mới từ dữ liệu truyền vào
            Node newNode = new Node(data);

            // Buoc 3: tao lien ket
            newNode.setPrevious(previousNode);
            previousNode.setNext(newNode);

            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);
            // Buoc 4: Tang size
            size++;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong! Khong the xoa.");
            return;
        }

        // Bước 1: Di chuyển head sang phần tử kế tiếp
        head = head.getNext();

        // Bước 2: Nếu danh sách không còn phần tử, thì head = null
        if (head != null) {
            head.setPrevious(null);
        }

        // Bước 3: Giảm size đi 1
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong! Khong the xoa.");
            return;
        }

        // Bước 1: Tìm node cuối cùng
        Node lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        // Bước 2: Di chuyển lastNode về phần tử trước nó
        Node previousNode = lastNode.getPrevious();

        // Bước 3: Xoá liên kết tới lastNode
        if (previousNode != null) {
            previousNode.setNext(null);
        } else {
            // Nếu danh sách chỉ có 1 phần tử
            head = null;
        }

        // Bước 4: Giảm size đi 1
        size--;
    }

    public void remove(int position) {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong! Khong the xoa.");
            return;
        }

        if (position < 0 || position >= size) {
            throw new RuntimeException("Vi tri khong hop le!");
        }

        if (position == 0) {
            removeFirst();
        } else if (position == size - 1) {
            removeLast();
        } else {
            // Bước 1: Tìm node ở vị trí cần xoá
            Node currentNode = head;
            for (int i = 0; i < position; i++) {
                currentNode = currentNode.getNext();
            }

            // Bước 2: Tách liên kết
            Node previousNode = currentNode.getPrevious();
            Node nextNode = currentNode.getNext();

            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);

            // Bước 3: Giảm size đi 1
            size--;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong!");
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp + "<=>");
            tmp = tmp.getNext();
        }
        System.out.print("NULL\n");
    }
}
