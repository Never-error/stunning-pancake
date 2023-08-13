package arrayandstring;

public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right< nums.length; right++){
            if(nums[left] == val){
                nums[left] = nums[right];
            }
            else {
                left++;
            }
        }
        return left +1 ;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,3,2,3,2,1};
        int ans = removeElement(nums,1);
        System.out.println(ans);
    }
}
