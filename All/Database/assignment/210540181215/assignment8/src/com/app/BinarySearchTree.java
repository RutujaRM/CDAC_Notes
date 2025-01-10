package com.app;

public class BinarySearchTree implements IBinarySearchTree {

	BinaryTreeNode root;
	int tree[];
	int i = 0;

	public BinarySearchTree() {
		root = null;
	}

	@Override
	public void Insert(int element) {
		BinaryTreeNode newNode = new BinaryTreeNode(element);
		BinaryTreeNode curr = root;
		BinaryTreeNode prev = null;

		if (curr == null) {
			root = newNode;
			return;
		}

		while (curr != null) {
			prev = curr;
			if (newNode.data < curr.data)
				curr = curr.left;
			else
				curr = curr.right;
		}

		if (newNode.data < prev.data)
			prev.left = newNode;
		else
			prev.right = newNode;

	}

	@Override
	public void Delete(int element) {
		BinaryTreeNode curr = root;
		BinaryTreeNode prev = null;

		while (curr != null) {
			prev = curr;
			if (element < curr.data)
				curr = curr.left;
			else if (element > curr.data)
				curr = curr.right;
			else
				break;
		}

		if (curr == null)
			return;

		if (curr.right != null && curr.left != null) {
			prev = curr;
			BinaryTreeNode succ = curr.right;
			while (succ.left != null) {
				prev = succ;
				succ = succ.left;
			}

			curr.data=succ.data;
			curr=succ;
		}
		
		if (curr.left == null) {
			if (prev.left == curr)
				prev.left = curr.right;
			else
				prev.right = curr.right;
		}
		
		if (curr.right == null) {
			if (prev.left == curr)
				prev.left = curr.left;
			else
				prev.right = curr.left;
		}
		
		if (curr.left == null && curr.right == null) {
			if (prev.left == curr)
				prev.left = null;
			else
				prev.right = null;
			return;
		}
		
	}

	@Override
	public boolean Search(int element) {
		BinaryTreeNode curr = root;
		while (curr != null) {
			if (element < curr.data)
				curr = curr.left;
			else if (element > curr.data)
				curr = curr.right;
			else
				break;
		}

		if (curr == null)
			return false;
		else
			return true;
	}

	public int[] InOrderHelper(BinaryTreeNode root) {
		if (root != null) {
			InOrderHelper(root.left);
			tree[i++] = root.data;
			InOrderHelper(root.right);
		}
		return tree;
	}

	@Override
	public int[] InOrder() {
		tree = new int[GetNodesCount()];
		return InOrderHelper(root);
	}

	private int GetNodesCountHelper(BinaryTreeNode root) {
		if (root == null)
			return 0;
		return 1 + GetNodesCountHelper(root.left) + GetNodesCountHelper(root.right);
	}

	public int GetNodesCount() {
		return GetNodesCountHelper(root);
	}

}
