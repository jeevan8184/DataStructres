package AllGraphs;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;

    }

    public static void main(String args[]) {
        int nums[] = { 4, 6, 4, 2, 5, 7, 8, 9, 4, 4, 6, 3, 6 };
        int val = 6;
        System.out.println(removeElement(nums, val));
        System.out.println(nums.length);

    }
}
