package com.app;

public class BinaryTree implements IBinaryTree {
	BinaryTreeNode root;
	int i = 0;
	int tree[];
	int height;
	int frequency = 0;

	public BinaryTree() {
		root = null;
	}

	public int[] BuildTreeForPreOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 3;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		root.left.left = new BinaryTreeNode(3);

		return element;
	}

	private int[] PreOrderHelper(BinaryTreeNode root) {
		if (root == null)
			return null;
		tree[i++] = root.data;
		if (root.left != null)
			PreOrderHelper(root.left);
		if (root.right != null)
			PreOrderHelper(root.right);
		return tree;
	}

	@Override
	public int[] PreOrder() {
		tree = new int[GetNodesCount()];
		return PreOrderHelper(root);
	}

	public int[] BuildTreeForPostOrder() {
		int[] element = new int[4];
		element[0] = 3;
		element[1] = 2;
		element[2] = 3;
		element[3] = 1;

		root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		root.left.left = new BinaryTreeNode(3);

		return element;
	}

	public int[] PostOrderHelper(BinaryTreeNode root) {
		if (root == null)
			return null;
		if (root.left != null)
			PostOrderHelper(root.left);
		if (root.right != null)
			PostOrderHelper(root.right);
		tree[i++] = root.data;
		return tree;
	}

	@Override
	public int[] PostOrder() {
		tree = new int[GetNodesCount()];
		return PostOrderHelper(root);
	}

	public int[] BuildTreeForInOrder() {
		int[] element = new int[4];
		element[0] = 3;
		element[1] = 2;
		element[2] = 1;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		root.left.left = new BinaryTreeNode(3);

		return element;
	}

	public int[] InOrderHelper(BinaryTreeNode root) {
		if (root == null)
			return null;
		if (root.left != null)
			InOrderHelper(root.left);
		tree[i++] = root.data;
		if (root.right != null)
			InOrderHelper(root.right);
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

	@Override
	public int GetNodesCount() {
		return GetNodesCountHelper(root);
	}

	private int heightHelper(BinaryTreeNode root) {
		if (root == null)
			return 0;
		int lDepth = heightHelper(root.left);
		int rDepth = heightHelper(root.right);
		if (lDepth > rDepth)
			return lDepth + 1;
		return rDepth + 1;
	}

	@Override
	public int Height() {
		return heightHelper(root);
	}

	private int FindFrequencyHelper(BinaryTreeNode root, int element) {
		if (root == null)
			return 0;
		if (root.data == element)
			frequency++;
		if (root.left != null)
			FindFrequencyHelper(root.left, element);
		if (root.right != null)
			FindFrequencyHelper(root.right, element);
		return frequency;
	}

	@Override
	public int FindFrequency(int element) {
		return FindFrequencyHelper(root, element);
	}

	private int CountLeafNodesHelper(BinaryTreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		return CountLeafNodesHelper(root.left) + CountLeafNodesHelper(root.right);
	}

	@Override
	public int CountLeafNodes() {
		return CountLeafNodesHelper(root);
	}

	private BinaryTreeNode MakeMirrorHelper(BinaryTreeNode root) {
		if (root == null)
			return root;
		BinaryTreeNode left = MakeMirrorHelper(root.left);
		BinaryTreeNode right = MakeMirrorHelper(root.right);
		root.left = right;
		root.right = left;
		return root;
	}

	@Override
	public void MakeMirror() {
		MakeMirrorHelper(root);
	}
}