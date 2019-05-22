package A_HomeWork;

import java.util.Arrays;

public class AAAADRAft {
	public void main(String[] args) {
		String[] SPECIAL_ITEMS = { "Cactus", "Fork", "T Shirt" };
		String[] order = {"Cactus", "Marble Clock", "Natural Bench", "T Shirt", "Gold Metal Frame Mirror", "T Shirt", "T Shirt", "Fork",  "Anchor", "Sunlight", "planet Saturn"};
		System.out.println(buyThreeDiscount(order, true));
		// TODO
		String[] newOrder;
		String[] bonusItemsArr;
		String bonusItems = "";
		int countSpecial = 0;
		int count = 0;
		for (int sp = 0; sp < SPECIAL_ITEMS.length; sp++) {
			count = 0;
			for (int list = 0; list < order.length; list++) {
				if (order[list].equals(SPECIAL_ITEMS[sp])) {
					count++;
				}
			}
			if (count >= 3) {
				countSpecial++;
				bonusItems += SPECIAL_ITEMS[sp] + ", ";
			} else {
				return order;
			}
		}
		bonusItems = bonusItems.substring(0, bonusItems.length() - 2);
		bonusItemsArr = bonusItems.split(",");
		if (isMember == true) {
			if (countSpecial == 1) {
				newOrder = Arrays.copyOf(order, order.length + 2);
				newOrder[order.length] = bonusItemsArr[0];
				newOrder[order.length + 1] = bonusItemsArr[0];
				return newOrder;
			} else if (countSpecial == 2) {
				newOrder = Arrays.copyOf(order, order.length + 4);
				newOrder[order.length] = bonusItemsArr[0];
				newOrder[order.length + 1] = bonusItemsArr[0];
				newOrder[order.length + 2] = bonusItemsArr[1];
				newOrder[order.length + 3] = bonusItemsArr[1];
				return newOrder;
			} else if (countSpecial == 3) {
				newOrder = Arrays.copyOf(order, order.length + 6);
				newOrder[order.length] = bonusItemsArr[0];
				newOrder[order.length + 1] = bonusItemsArr[0];
				newOrder[order.length + 2] = bonusItemsArr[1];
				newOrder[order.length + 3] = bonusItemsArr[1];
				newOrder[order.length + 4] = bonusItemsArr[2];
				newOrder[order.length + 5] = bonusItemsArr[2];
				return newOrder;
			}
		} else {
			if (countSpecial == 1) {
				newOrder = Arrays.copyOf(order, order.length + 1);
				newOrder[order.length] = bonusItemsArr[0];
				return newOrder;
			} else if (countSpecial == 2) {
				newOrder = Arrays.copyOf(order, order.length + 2);
				newOrder[order.length] = bonusItemsArr[0];
				newOrder[order.length + 1] = bonusItemsArr[1];
				return newOrder;
			} else if (countSpecial == 3) {
				newOrder = Arrays.copyOf(order, order.length + 3);
				newOrder[order.length] = bonusItemsArr[0];
				newOrder[order.length + 1] = bonusItemsArr[1];
				newOrder[order.length + 2] = bonusItemsArr[2];
				return newOrder;
			}
		}
	}
}
