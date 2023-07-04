import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private Node<T> head;
    private int size;
    
    private static class Node<T>{
            T data;
            Node<T> next;

            Node(T data){
                this.data = data;
                this.next = null;
            }
    }
    SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    SimpleLinkedList(T[] values) {
        this.head = null;
        this.size = 0;
        for(T value : values){
            push(value);
        }        
    }

    void push(T value) {
        Node<T> nextNode = new Node<T>(value);
        nextNode.next = head;
        head = nextNode;
        size++;
    }

    T pop() throws NoSuchElementException {
        if (head == null){
            throw new NoSuchElementException();
        }
        T popped = head.data;
        head = head.next;
        size--;
        return popped;
    }

    void reverse() {
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> nxt;

        while (curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) new Object[size];
        Node<T> curr = head;
        int index = 0;

        while(curr != null){
            arr[index] = curr.data;
            curr = curr.next;
            index++;
        }
        return arr;
    }

    int size() {
        return size;
    }
}
