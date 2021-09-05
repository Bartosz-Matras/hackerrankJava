package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        EmptyBST<Integer> emptyBST = new EmptyBST<Integer>();
        for (int i = 0; i < n; i++){
            emptyBST.add(scanner.nextInt());
        }

        System.out.println(emptyBST.cardinality());
        scanner.close();

    }
}