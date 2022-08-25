package code1;


	
	static class Node {
		
		int data;
		Node left;
		Node right;
		
		
		Node(int data ) {
			
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
		
	}
	
	static class BinaryTree {
		static int idx = -1;
		
		public static Node buildTree(int nodes[]) {
			
			idx++;
			if(nodes[idx] == -1 ) {
				if(nodes[idx] == -1 ) {
					return null;
			}
				
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.left = buildTree(nodes);
				
			return newNode;
			
		}
	}
		
	public static void main(String[] args) {
		
			
		int nodes[] =  {1,2,4,-1,-1,8,-1,-1,7,-1,8,9,-1,9,9,-1};
			
		BinaryTree tree = new BinaryTree();
			
		Node root =  tree.buildTree(nodes);
			
		System.out.println(root.data);
	}
}

