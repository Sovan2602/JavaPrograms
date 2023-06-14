public class pracduplicateele {
    public static int[] findDuplicateElements(int[] nums) {
        int[] count = new int[1001]; 
        int duplicatesCount = 0;
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                duplicatesCount++;
            }
        }
        int[] duplicates = new int[duplicatesCount];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                duplicates[index] = i;
                index++;
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] duplicateElements = findDuplicateElements(nums);
        System.out.print("Duplicate elements: ");
        for (int num : duplicateElements) {
            System.out.print(num + " ");
        }
    }
}
