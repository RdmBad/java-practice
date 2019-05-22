package A_HomeWork;

public class AAADraft {
	public static void main(String[] args) {

		String[] order = { "dog", "cactus", "cactus", "coffee mug", "coffee mug", "flower" };

		int count = 0;
		int duplicateCount = 0;
		for (int i = 0; i < order.length; i++) {
			count = 0;
			for (int j = 0; j < order.length; j++) {
				if (order[i].equals(order[j]) && i != j) {
					count++;
				}
			}
			if (count > 0) {
				duplicateCount++;
			}
		}
		if (duplicateCount > 0) {
			System.out.println(duplicateCount);
		} else {
			System.out.println("nothing");
		}
	}
}