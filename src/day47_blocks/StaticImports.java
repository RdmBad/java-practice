package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays.*;
import static java.time.LocalDateTime.now;

import java.util.Arrays;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI); // 3.14
		System.out.println(max(10, 5));
		System.out.println(max(10, 10));
		System.out.println(min(2, 10));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(round(15.4999));
		System.out.println(abs(-10));
		System.out.println(pow(10.3, 2));
		System.out.println(sqrt(5));
		System.out.println(random() * 10);
//========================================================
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('a'));
//========================================================
		int[] nums = { 31, 34, 45, 6, 7, 234 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
//========================================================
		System.out.println(now());
	}
}
