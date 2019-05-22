package A_HomeWork;

public class ass176 {
	public void main(String[] args) {
		int[] Arr = { 2, 3, 4, 5, 6, 9 };
		findMax(Arr);
	}

	public int findMax(int[] Arr) {
		int max = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (max < Arr[i]) {
				max = Arr[i];
			}
		}
		return max;
	}

	public double findMax(double[] Arr) {
		double max = 0;
		for (int i = 0; i < Arr.length; i++) {
			if (max < Arr[i]) {
				max = Arr[i];
			}
		}
		return max;
	}
}
