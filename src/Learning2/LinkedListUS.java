package Learning2;

import java.util.LinkedList;

public class LinkedListUS<D> {

    // Properties
    Node<D> head;
    int count;

    // Constructors
//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    //Methods

    // add
    public void add(D newData){
        Node<D> temp = new Node<>(newData);
        Node<D> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index) throws IllegalArgumentException{
        if (index <= 0){
            throw new IllegalArgumentException("Index must be greater than 0.");
        }
        Node<D> current = head;
        for (int i =  1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // remove
    public void remove(){
        // remove from the back of the list
        Node<D> current = head;
        while (current.getNext().getNext() == null){
            current = current.getNext();
        }
        current.setNext(null);
        count --;
    }


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);
        System.out.println();
        System.out.println();


        LinkedListUS<Integer> linkedListUS = new LinkedListUS<>(new Node<>(7));
        linkedListUS.add(8);
        try{
            System.out.println(linkedListUS.get(0));
            System.out.println(linkedListUS.get(1));
            System.out.println(linkedListUS.get(2));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Size: " + linkedListUS.size());

    }
}
