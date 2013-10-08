package Search;

import java.util.LinkedList;
/*
 * A breadth first search (BFS) through a tree starts at the root and 
 * moves from nodes left to right at each level until all the nodes 
 * have been looked at or until the value is found. 
 * Keep in mind that BFS uses a lot of memory to keep track of the 
 * child nodes for all nodes on a given level while searching that 
 * level. 
 * ============================================================
 * BFS is best used when the target you are looking for is most 
 * likely near the top of the tree.
 * ============================================================
 */
public class BFS {// each TreeNode is a BinaryTree itself.
	
	boolean bfs(BinaryTree root, int target) {
	    if (root == null)
		return false;
	 
	    LinkedList<BinaryTree> list = new LinkedList();//space complexity O(N)
	    BinaryTree tmp;
	    list.add(root);
	 
	    while (list.size() > 0) {
		tmp = list.remove();
	 
		if ( ((Integer) (tmp.value)).intValue() == target)
		    return true;
		if (tmp.getLeftChild() != null)
		    list.add(tmp.getLeftChild());
		if (tmp.getRightChild() != null)
		    list.add(tmp.getRightChild());
	    }
	 
	    return false;
	}
	
	void inorder(BinaryTree root) {
	    if (root != null) {
	    inorder(root.getLeftChild());
		System.out.print(root.getValue()+ " ");
		inorder(root.getRightChild());
	    }
	}
	
	public static void main (String[] args){
		BinaryTree<Integer> Root = new BinaryTree(100);
		BinaryTree<Integer> L1 = new BinaryTree(10);
		BinaryTree<Integer> R1 = new BinaryTree(200);
		L1.setLeftChild(new BinaryTree(1));
		L1.setRightChild(new BinaryTree(12));
		R1.setLeftChild(new BinaryTree(190));
		R1.setRightChild(new BinaryTree(219));
		Root.setLeftChild(L1);
		Root.setRightChild(R1);
		BFS x = new BFS();
		x.inorder(Root);
		System.out.println();
		System.out.println("looking for 190 using BFS: " +x.bfs(Root,190));
		System.out.println("looking for 123 using BFS: " +x.bfs(Root,123));
	}

}
