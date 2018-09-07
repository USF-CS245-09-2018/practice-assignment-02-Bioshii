public class BinaryRecursiveSearch implements Practice2Search {
    int[] arr;
    int target;

    public String searchName() {
        return "BinaryRecursiveSearch";
    }

    public int search(int [] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        return search(arr, target, start, end);
    }

    public int search(int [] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (end + start)/2;

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
