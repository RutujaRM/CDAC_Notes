package tester;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.BinaryTree;

class BinaryTreeTest {

	BinaryTree bt;

	@Test
	void testPreOrder() {
		bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.PreOrder();
		assertArrayEquals(element, traversalResult);
	}

	@Test
	void testFrequency() {
		int example = 3;
		bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int count = 0;

		for (int x : element) {
			if (x == example)
				count++;
		}
		assertEquals(count, bt.FindFrequency(example));
	}

	@Test
	void testHeight() {
		bt = new BinaryTree();
		bt.BuildTreeForPreOrder();
		assertEquals(3, bt.Height());
	}

	@Test
	void testCountLeafNodes() {
		bt = new BinaryTree();
		bt.BuildTreeForPreOrder();
		assertEquals(2, bt.CountLeafNodes());
	}
	
	@Test
	void testMakeMirror() {
		bt = new BinaryTree();
		bt.BuildTreeForPreOrder();
		bt.MakeMirror();
		System.out.println(Arrays.toString(bt.PreOrder()));
	}
	
	@Test
	void testPostOrder() {
		bt = new BinaryTree();
		int[] element = bt.BuildTreeForPostOrder();
		int[] traversalResult = bt.PostOrder();
		assertArrayEquals(element, traversalResult);
	}
	
	@Test
	void testInOrder() {
		bt = new BinaryTree();
		int[] element = bt.BuildTreeForInOrder();
		int[] traversalResult = bt.InOrder();
		assertArrayEquals(element, traversalResult);
	}

}
