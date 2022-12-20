package classProblemByAmolMateSir.Day14PracticeProblem.StackAndQueue;

public class QueueClass <T>{
    Node head;
    Node tail;

    int size;
    public QueueClass() {
        this.size = 0;
    }

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public boolean isEmpty() {

        return head == null && tail == null;
    }

    //enqueue
    public void add(T data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = head = newNode;    //first element
        }

        tail.next = newNode;
        tail = newNode;

    }

    //dequeue
    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        size--;
        T front = head.data;
        head = head.next;
        return front;
    }

    //peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        return head.data;

    }

    public void Print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        Node temp = head;
        {
            while (temp != null) {                            //traversing
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }

    public static void main(String[] args) {
        QueueClass obj = new QueueClass();

        obj.add(56);
        obj.add(30);
        obj.add(70);


        obj.Print();
        System.out.println();

        obj.remove();
        System.out.println(obj.peek());
        System.out.println();
        System.out.println(obj.size);
    }


}
