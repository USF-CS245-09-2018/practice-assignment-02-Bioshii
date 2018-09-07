public class BinaryIterativeSearch implements Practice2Search {

    public String searchName() {
        return "BinaryIterativeSearch";
    }

    public int search(int[] arr, int target) {
        //Check mid value, if larger move lower to mid, smaller move higher to mid, break if it is found
        int start = 0;
        int end = arr.length-1;


        while (end >= start) {
            //Mid is the index of half the array
            int mid = (start + end)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }

        return -1;
    }
}
