import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UndirectedUnWeightedGraphTest {
	@Test
	void testDFS() {
		UndirectedUnWeightedGraph g = new UndirectedUnWeightedGraph(5);

		g.AddEdge(0, 1);
		g.AddEdge(0, 2);
		g.AddEdge(0, 3);
		g.AddEdge(2, 3);
		g.AddEdge(3, 4);

		g.DFS(0);
		assertTrue(true);
	}

}
