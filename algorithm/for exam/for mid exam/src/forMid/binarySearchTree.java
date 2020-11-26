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
	
	public void delete(Node node, int value) {
		if (node == null) return;
		
		if(node.value == value) this.root = deleteNode(node, value);
		else if (node.value >= value) {
			if(node.left.value == value) node.left = deleteNode(node.left, value);
			else delete(node.left, value);
		}
		else {
			if(node.right.value == value) node.right = deleteNode(node.right, value);
			else delete(node.right, value);
		}

	}
	
	public Node deleteNode(Node node, int value) {
		// case 1
		if(node.left == null && node.right == null) {
			return null;
		}
		// case 2
		if(node.left == null && node.right != null) {
			return node.right;
		}
		if(node.left != null && node.right == null) {
			return node.left;
		}
		// case 3
		if(node.left != null && node.right != null) {
//			// case 3-1
//			Node rep = node.right;
//			Node rep_parent = node;
//			// case 3-3 
//			if (rep.left == null) {
//				rep.left = node.right;
//				return rep;
//			}
//			
//			while (rep.left != null) {
//				rep_parent = rep;
//				rep = rep.left;
//			}
//			//case 3-2
//			rep_parent.left = rep.right;
//			rep.left = node.left;
//			rep.right = node.right;
//			return rep;
			Node rep = node.left;
			Node rep_parent = node;
			if(rep.right == null) {
				rep.right = node.right;
				return rep;
			}
			while (rep.right != null) {
				rep_parent = rep;
				rep = rep.right;
			}
			rep_parent.right = rep.left;
			rep.left = node.left;
			rep.right = node.right;
			
			return rep;
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
