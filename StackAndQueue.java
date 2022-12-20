package classProblemByAmolMateSir.Day14PracticeProblem.StackAndQueue;

public class StackAndQueue<T> {

    Node head;

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {

        return head == null;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;         //first element
            return;
        }
        Node next = head;
        head = newNode;
    }

    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        T top = head.data;     //assinging last element value to top
        head = head.next;
        return top;

    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return head.data;

    }

    public static void main(String[] args) {
        StackClass obj = new StackClass();
        obj.push(56);
        obj.push(30);
        obj.push(70);


        obj.pop();
        obj.Print();

        System.out.println(); //space betwin
        System.out.println(obj.peek());

    }
}
