package day27_arrays05;
import java.util.*;
public class CopyOf2 {
	public static void main(String[] args) {
		//copy all the values from array and 
		//also add 2 more spaces
		int[] nums1 = { 34, 56, 23, 1, 55 };
		int[] nums2 = Arrays.copyOf(nums1, nums1.length + 2);  // ---->> plus 2 spaces = 0
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3);
		System.out.println("Nums3: " + Arrays.toString(nums3));
		System.out.println(Arrays.toString(nums2));
		
		int[] brandNew = {34, 23, 54, 23};
		System.out.println("Length before: " + Arrays.toString(brandNew));
		brandNew = Arrays.copyOf(brandNew, brandNew.length + 5);
		System.out.println("Length after: " + Arrays.toString(brandNew));
	}
}
