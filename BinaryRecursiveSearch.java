public class BinaryRecursiveSearch implements Practice2Search {
    int[] arr;
    int target;

    public String searchName() {
        return "BinaryRecursiveSearch";
    }

    public int search(int [] arr, int target) {
        //Start is 0 or first position in array, end is the length of the array -1
        int start = 0;
        int end = arr.length -1;
        //Send this data to the recursive function
        return search(arr, target, start, end);
    }

    public int search(int [] arr, int target, int start, int end) {
        //If starting value is greater than end value, return -1
        //This means that the value was never found, and eventually the start
        //value became larger than end value
        if (start > end) {
            return -1;
        }

        //Mid is the middle value of end and start
        int mid = (end + start)/2;

        //If value at mid index is equal to target, return mid value
        //If value at target is greater than value at mid index, set start to mid + 1
        //If value at target is less than value at mid index, set end to mid -1
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return search(arr, target, mid+1, end);
        } else if (target < arr[mid]) {
            return search(arr, target, start, mid-1);
        }

        return -1;
    }
}
