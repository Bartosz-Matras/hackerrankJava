package ThirtyDaysOfCoding;

import java.util.Scanner;

public class Day23 {

    public static int getHeight(Node root){
        if (root == null){
            return 0;
        }
        int left = getHeight(root.leftChild);
        int right = getHeight(root.rightChild);
        return Math.max(left, right) + 1;
    }

    public static Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }else{
            Node cur;
            if (data <= root.data){
                cur = insert(root.leftChild, data);
                root.leftChild = cur;
            }else{
                cur = insert(root.rightChild, data);
                root.rightChild = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Node root = null;

        while(n-- > 0){
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);

        scanner.close();
    }
}

class Node {

    int data;

    Node leftChild;
    Node rightChild;

    public Node(int data){
        this.data = data;
        leftChild = rightChild = null;
    }

}