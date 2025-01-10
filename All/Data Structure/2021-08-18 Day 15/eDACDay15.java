
public class eDACDay15 {
	static int callCount;
	static int[] m;
	static int[] t;

	public static int fibSeriesTermDaQ(int n) {
		++callCount;

		if (n <= 2) {
			return 1;
		}

		return fibSeriesTermDaQ(n - 1) + fibSeriesTermDaQ(n - 2);
	}

	public static void createMemonizatoinTable(int n) {
		m = new int [n + 1];
		for (int i = 0; i <= n; ++i) {
			m[i] = 0;
		}
	}

	private static void createDPTable(int n) {
		t = new int [n + 1];
		t[1] = 1;
		t[2] = 1;
		for (int i = 3; i <= n; ++i) {
			t[i] = t[i - 1] + t[i - 2];
		}
	}

	public static int fibSeriesTermDPTopDown(int n) {
		++callCount;

		if (n <= 2) {
			return 1;
		}

		if (m[n] != 0) {
			return m[n];
		}

		int result = fibSeriesTermDPTopDown(n - 1) + fibSeriesTermDPTopDown(n - 2);
		m[n] = result;
		return result;
	}

	public static int fibSeriesTermDPBottomUp(int n) {
		++callCount;

		return t[n];
	}

	public static void main(String[] args) {
		callCount = 0;
		System.out.println("10th term = " + fibSeriesTermDaQ(10) + ". Call count = " + callCount);
		
		createMemonizatoinTable(10);
		callCount = 0;
		System.out.println("10th term = " + fibSeriesTermDPTopDown(10) + ". Call count = " + callCount);

		createDPTable(10);
		callCount = 0;
		System.out.println("10th term = " + fibSeriesTermDPBottomUp(10) + ". Call count = " + callCount);
	}

}
