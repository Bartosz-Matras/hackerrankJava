package Learning2;

public class Node<D> {
    // Properties
    Node<D> next;
    D data;

    // Methods


    // Constructors
    public Node(D data) {
        this.data = data;
        next = null;
    }

    public Node(D data, Node<D> next){
        this.data = data;
        this.next = next;
    }


    // Getters and Setters
    public D getData() {
        return data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setData(D data) {
        this.data = data;
    }

    public void setNext(Node<D> next) {
        this.next = next;
    }
}
