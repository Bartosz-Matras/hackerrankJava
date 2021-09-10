package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        EmptyBST<Integer> emptyBST = new EmptyBST<Integer>();
//        for (int i = 0; i < n; i++){
//            emptyBST.add(scanner.nextInt());
//        }
//
//        System.out.println(emptyBST.cardinality());
//        scanner.close();


        // Testing
        EmptyBST<Integer> e = new EmptyBST<Integer>();
        NonEmptyBST<Integer> ne = new NonEmptyBST<Integer>(5);


        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(ne);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(ne);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(ne);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(ne);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(ne);


        System.out.println();
        Testers.checkAddMemberCardinality(e, 5);
        Testers.checkAddMemberCardinality(ne, 5);
        Testers.checkAddMemberCardinality(ne, 6);


        int test = 100_000;
        for (int i = 0; i < test; i++){
            Tree t;
            if (i % 10 == 0){
                t = Testers.rndTree(0);
            }else{
                t = Testers.rndTree(10);
            }
            Testers.checkAddMemberCardinality(t, i);
            Testers.checkIsEmpty(t);
        }

    }
}
