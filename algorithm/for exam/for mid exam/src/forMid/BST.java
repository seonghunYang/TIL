package forMid;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BST {
    public static class Node {
    int value;
    Node left;
    Node right;
    
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public Node insert(Node node, int value) {
        if (node == null) return new Node(value);
        
        if (node.value >= value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));//(1)
        String line = "";
        while (true) {
            line = br.readLine();
            if (line == null || line.length() == 0) {
                break;
            }

            //(2)
            root = root.insert(root, Integer.parseInt(line));
        }
        postOrder(root);
	}
    
    public static void postOrder(Node node) {
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.println(node.value);
    }
	
}
