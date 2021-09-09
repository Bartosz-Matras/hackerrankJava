package ThirtyDaysOfCoding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day25 {

    public static Node4 removeDuplicates(Node4 head) {
        Set<Integer> set = new HashSet<>();
        if (head == null) return head;
        set.add(head.data);
        Node4 curr = head;
        while (curr.next != null) {
            if (set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.data);
                curr = curr.next;
            }
        }
        return head;
    }

    public static Node4 insert(Node4 head, int data){
        Node4 p = new Node4(data);
        if (head == null){
            head = p;
        }else if (head.next == null){
            head.next = p;
        }else{
            Node4 start = head;
            while (start.next != null){
                start = start.next;
            }
            start.next = p;
        }
        return head;
    }


    public static void display(Node4 head){
        Node4 start = head;
        while (start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node4 head = null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}

class Node4{
    int data;
    Node4 next;
    Node4(int d){
        data=d;
        next=null;
    }
}