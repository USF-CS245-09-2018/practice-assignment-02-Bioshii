public class BinaryIterativeSearch implements Practice2Search {

    public String searchName() {
        return "BinaryIterativeSearch";
    }

    public int search(int[] arr, int target) {
        //Start is 0 or first position in array, end is the length of the array -1
        int start = 0;
        int end = arr.length-1;

        //Keep going until end is greater than start
        //This means that the value was never found, and eventually the start
        //value became larger than end value
        while (end >= start) {
            //Mid is the index of half the array
            int mid = (start + end)/2;

            //If value at mid index is equal to target, return mid value
            //If value at target is greater than value at mid index, set start to mid + 1
            //If value at target is less than value at mid index, set end to mid -1
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }

        //Return -1 if the value isn't found
        return -1;
    }
}
