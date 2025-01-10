package com.app;

public interface IBinaryTree {
	public int[] PreOrder();

	public int[] PostOrder();

	public int[] InOrder();

	int GetNodesCount();

	int Height();

	int FindFrequency(int element);

	int CountLeafNodes();

	void MakeMirror();
}
