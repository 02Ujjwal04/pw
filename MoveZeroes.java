import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0; // slow pointer

        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        // Fill the remaining elements with zeros
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Input: " + Arrays.toString(nums));
        
        moveZeroes(nums);
        
        System.out.println("Output: " + Arrays.toString(nums));
    }
}


// solution:
// Input: [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]
