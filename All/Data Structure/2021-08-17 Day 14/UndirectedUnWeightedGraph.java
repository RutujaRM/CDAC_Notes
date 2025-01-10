public class UndirectedUnWeightedGraph implements UnweightedGraphIntf {
	int[][] adjMat; // SinglyList[] adjList;
	int n; // Vertex Count

	public UndirectedUnWeightedGraph(int n) {
		this.n = n;
		adjMat = new int[n][n];

		// Initialize adjacency matrix as no edge information present.
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				adjMat[i][j] = 0;
			}
		}
	}

	@Override
	// Vertex number in graph are 0 based.
	public void AddEdge(int v, int u) {
		adjMat[v][u] = 1;
		adjMat[u][v] = 1;
	}

	private void DFSHelper(int startVertex, boolean[] isVisited,
			int[] result, int[] resultCount) {
		if (!isVisited[startVertex]) {
			// Mark vertex as visited.
			isVisited[startVertex] = true;

			// Process the startVertex.
			System.out.println(startVertex);
			result[resultCount[0]] = startVertex;
			resultCount[0]++;
		}

		// For every adjacent vertex to startVertex
		for (int i = 0; i < n; ++i) {
			if (adjMat[startVertex][i] != 0) {
				// Vertex i is adjacent to startVertex.
				// if adjacent vertex is not visited.
				if (!isVisited[i]) {
					// DFS(vertex)
					DFSHelper(i, isVisited, result, resultCount);
				}
			}
		}
	}

	@Override
	public int[] DFS(int startVertex) {
		// Mark every vertex as not visited.
		boolean[] isVisited;
		isVisited = new boolean[n];
		for (int i = 0; i < n; ++i) {
			isVisited[i] = false;
		}

		// Create result array.
		int[] result;
		result = new int[n];
		int[] resultCount;
		resultCount = new int[1];
		resultCount[0] = 0;

		// Do DFS from startVertex
		DFSHelper(startVertex, isVisited, result, resultCount);

		return result;
	}
}
