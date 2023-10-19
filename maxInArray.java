public class MaxNumberInArray {

    // Function to find the maximum element in an array using recursion
    public static int findMax(int[] arr, int index) {
        // Base case: if the index is the last element, return the element itself
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursively find the maximum element in the sub-array
        int maxRest = findMax(arr, index + 1);

        // Compare the current element with the maximum of the rest of the array
        return Math.max(arr[index], maxRest);
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 7, 8, 20, 15}; // Example array

        // Find the maximum number using recursion
        int max = findMax(array, 0);

        System.out.println("Maximum number in the array is: " + max);
    }
}
