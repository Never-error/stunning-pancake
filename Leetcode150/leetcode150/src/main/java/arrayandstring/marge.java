package arrayandstring;

import java.util.Arrays;

public class marge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num : nums2){
            for (int i = m ; i < nums1.length; i++){
                nums1[i] = nums2[m-i];
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[] = {1,3,4,0,0,0};
        int nums2[] = {2,4,5};
        nums1 = new int[0];
    }
}
