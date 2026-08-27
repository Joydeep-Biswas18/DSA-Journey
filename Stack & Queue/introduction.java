
import java.util.LinkedList;
import java.util.Queue;


public class introduction {

    public static void main(String[] args) {

        Stack_implementation stack = new Stack_implementation(5);

        stack.push(5);
        System.out.println("Top: " + stack.top());

        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.push(26);

        System.out.println("Top: " + stack.top());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Size: " + stack.size());

        System.out.println("Queue");
        //Implement Queue Using Array
        Queue_Implementation Queue = new Queue_Implementation(10);
        Queue.push(4);
        Queue.push(3);
        Queue.push(5);
        Queue.push(8);
        Queue.push(0);
        Queue.push(57);

        System.out.println(Queue.peek());

        System.out.println("Popped: " + Queue.pop());

    }
}

class Stack_implementation {

    int top_index;
    int capacity;
    int[] stackArray;

    public Stack_implementation(int size) {

        capacity = size;
        stackArray = new int[capacity];
        top_index = -1;
    }

    public Stack_implementation() {
        this(100);
    }

    // Push
    public void push(int x) {

        if (top_index == capacity - 1) {
            System.out.println("The Stack is Overflow");
        } else {
            top_index++;
            stackArray[top_index] = x;
            System.out.println("Done");
        }
    }

    // Top
    public int top() {

        if (top_index == -1) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            return stackArray[top_index];
        }
    }

    // Pop
    public int pop() {

        if (top_index == -1) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            int value = stackArray[top_index];
            top_index--;
            return value;
        }
    }

    // Size
    public int size() {
        return top_index + 1;
    }
}

class Queue_Implementation {

    static int capacity;
    static int start;
    static int end;
    static int currSize;
    static int[] QUeueArray;

    public Queue_Implementation(int size) {
        capacity = size;
        start = -1;
        end = -1;
        currSize = 0;
        QUeueArray = new int[capacity];

    }

    public static void push(int x) {
        // Check if the queue is full
        if (currSize == capacity) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }

        // If the queue is empty, initialize start and end
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            // Circular increment of end
            end = (end + 1) % capacity;
        }

        QUeueArray[end] = x;
        currSize++;

    }

    // Method to get the front element of the queue
    public static int peek() {
        // Check if the queue is empty
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return QUeueArray[start];
    }

    public static int pop() {
        if (start == -1 || end == -1) {
            System.out.println("The Queue is empty");
            return -1;
        }
        int popped = QUeueArray[start];

        // If the queue has only one element, reset start and end
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            // Circular increment of start
            start = (start + 1) % capacity;
        }

        currSize--;
        return popped;

    }
}

class Node {

    int value;
    Node next;

    Node(int data) {
        value = data;
        next = null;
    }

}

class LinkedListStack {

    static int size;
    static Node head;

    public LinkedListStack() {
        size = 0;
        head = null;

    }

    public static void push(int x) {
        // Creating a node
        Node element = new Node(x);

        element.next = head;  // Updating the pointers
        head = element;  // Updating the top

        // Increment size by 1
        size++;
    }
    // Method to pop an element from the stack
    public int pop() {
        // If the stack is empty
        if (head == null) {
            return -1; // Pop operation cannot be performed
        }
        
        int value = head.value; // Get the top value
        Node temp = head; // Store the top temporarily
        head = head.next; // Update top to next node
        temp = null; // Delete old top node
        size--; // Decrement size
        
        return value; // Return data
    }

    // Method to get the top element of the stack
    public int top() {
        // If the stack is empty
        if (head == null) {
            return -1; // Top element cannot be accessed
        }
        
        return head.value; // Return the top
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (size == 0);
    }
}
//Implement Stack Using Queue data Structure
class Stack_using_Queue{
    static Queue<Integer> q = new LinkedList<>();

    //Method for Push operation And That is the most important thing to know
    //Push Operation
    public static void push(int x){
        q.add(x);
        int s = q.size();
        for(int i =0; i<s;i++){
            q.add(q.remove());
        }


    }

    //Pop Operation
    public static int pop(){
        if(q.isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else{
            return q.remove();
        }
    }

    //Top/Peak Operation
    public static int top(){
        if(q.isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;

        }
        else{
            return q.peek()
        }
    }

    //size
    public static int size(){
        return q.size();
    }
}



