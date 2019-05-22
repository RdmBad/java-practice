package A_HomeWork;

import java.util.*;

public class AAAAAAADraft {
	public static void main(String[] args) {

		// TODO
		String[] SPECIAL_ITEMS = { "Cactus", "Fork", "T Shirt" };
		String[] order = { "Cactus", "Marble Clock", "Natural Bench", "T Shirt", "Gold Metal Frame Mirror", "T Shirt",
				"T Shirt", "Fork", "Anchor", "Sunlight", "planet Saturn" };
		boolean isMember = false;
		String bonusItems = "";
		int count = 0;
		int plus = 0;
		for (int sp = 0; sp < SPECIAL_ITEMS.length; sp++) {
			count = 0;
			for (int list = 0; list < order.length; list++) {
				if (order[list].equals(SPECIAL_ITEMS[sp])) {
					count++;
				}
			}
			if (count >= 3) {
				bonusItems += SPECIAL_ITEMS[sp] + " ";
				if (isMember = true) {
					plus = 2;
				} else {
					plus = 1;
				}
			}
		}
		String[] newOrder = Arrays.copyOf(order, order.length + plus);
		bonusItems = bonusItems.substring(0, bonusItems.length() - 1);
		String[] bonusItemsArr = bonusItems.split(", ");

		if (isMember = true) {
			newOrder[newOrder.length - 2] = bonusItemsArr[0];
			newOrder[newOrder.length - 1] = bonusItemsArr[0];
		} else if (isMember = false) {
			newOrder[newOrder.length - 1] = bonusItemsArr[0];
		}
		System.out.println(Arrays.toString(newOrder));
	}

}
