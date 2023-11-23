public class recursion {
  public static void main(String[] args) {

    int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
    int target = 16;
    int index = binarySearch(arr, target, 0, arr.length - 1);

    if (index != -1) {
      System.out.println("Element " + target + " found at index " + index);
      } 
    else {
      System.out.println("Element " + target + " not found in the array.");}

   }
    
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Element found at mid index
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, high); // Search in the right half
        }
    
  
}
}
    

    
