class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[left] + numbers[right] == target) {
                arr[0]=left+1;
                arr[1]=right+1;
            }
            else if(numbers[left] + numbers[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}