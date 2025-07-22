
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {

            // For each element, iterate over the subsequent elements
            for (int j = i + 1; j < nums.length; j++) {

                // Check if the sum of the two elements equals the target
                if (nums[i] + nums[j] == target) {

                    // Return the indices of the two numbers
                    return new int[] { i, j };
                }
            }
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }
}
