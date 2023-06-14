public class pracmajorityele {
    public static int findMajorityElement(int[] nums) {
        int majorityElement = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            } else if (majorityElement == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Check if the majority element appears more than n/2 times
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        return count > nums.length / 2 ? majorityElement : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority element: " + majorityElement);
    }
}
