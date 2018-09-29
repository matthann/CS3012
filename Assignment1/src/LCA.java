class Node  {
	
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 

public class LCA {
	
	
	Node findLCA(Node node, int n1, int n2) {

		if (node == null) {
			return null;
		}

		if (node.data == n1 || node.data == n2) {
			return node;
		}

		Node left = findLCA(node.left, n1, n2);
		Node right = findLCA(node.right, n1, n2);

		if (left != null && right != null) {
			return node;
		}

		if (left != null) {
			return left;
		} else {
			return right;
		}

	}
	
}
