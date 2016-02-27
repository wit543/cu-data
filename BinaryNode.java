package y2014;

/**
 * Created by WIT on 27-Feb-16.
 */
public class BinaryNode {
    int element;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int element, BinaryNode left, BinaryNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(int element){
        this.element=element;
    }
}
