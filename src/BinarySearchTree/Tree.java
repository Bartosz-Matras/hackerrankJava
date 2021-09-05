package BinarySearchTree;

public interface Tree<D extends Comparable> {

    boolean isEmpty();
    int cardinality();
    boolean member(D element);
    NonEmptyBST<D> add(D elt);
}
