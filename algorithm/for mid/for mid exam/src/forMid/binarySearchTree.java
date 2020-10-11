package forMid;

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

public class binarySearchTree {
	Node root;
	public binarySearchTree(int value) {
		this.root = new Node(value);
	} 
	
	public static void traversal(Node node) {
		System.out.print(node.value);
		if (node.left != null) traversal(node.left);
		
		if (node.right != null) traversal(node.right);
		
	} 
	
	public static Node insert(Node node, int value) {
		if (node == null) {return new Node(value);}
		
		if(node.value >= value) {
			node.left = insert(node.left, value);
			return node;
		} else {
			node.right = insert(node.left, value);
			return node;
		}
	}
	public void insert(int value) {
		Node cur_node = this.root;
		
		while(true) {
			if (cur_node.value >= value) {
				if (cur_node.left == null) {
					cur_node.left = new Node(value);
					return;
					} 
				else cur_node = cur_node.left;
			} else {
				if (cur_node.right == null) {
					cur_node.right = new Node(value);
					return;
					}
				else cur_node = cur_node.right;
			}
			
		}
	}
	
	public static Node search(Node node, int value) {
		if (node == null) return null;
		
		if(node.value == value) return node;
		else if (node.value >= value) return search(node.left, value);
		else return search(node.right, value);
	}
	
	public Node search(int value) {
		Node cur_node = this.root;
		
		while(cur_node != null) {
			if(cur_node.value == value) return cur_node;
			else if (cur_node.value >= value) cur_node = cur_node.left;
			else cur_node = cur_node.right;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySearchTree BST = new binarySearchTree(7);
		BST.insert(6);
		BST.insert(5);
		BST.insert(3);
		BST.traversal(BST.root);
		System.out.println(BST.search(2));
	}

}
