import java.util.ArrayList;
import java.util.List;

public class TreesProblemSolution {

	public static void main(String[] args) {
		int n = 6;
		// byte[] byteArray = toByteArray(value);
		// System.out.println(byteArray.length);

		// String hexString = toHexString(byteArray);
		// System.out.println(hexString);

	}

	List bst = new ArrayList<Integer>();
	boolean checkBST(Node root) {
        return checkBST(root, 0, 10000); // range of values in problem
}
boolean checkBST(Node node, int min, int max) {
 if (node == null) {
    return true;
    } else if (node.data < min || node.data > max) {
    return false;
    }
    return checkBST(node.left, min, node.data-1) && checkBST(node.right, node.data+1, max);

	}

}
class Node {

	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}

}
