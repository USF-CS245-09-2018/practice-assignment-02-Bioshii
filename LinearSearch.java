public class LinearSearch implements Practice2Search {
    public String searchName() {
        return "LinearSearch";
    }

    public int search(int [] arr, int target) {
        //Iterate through the array until the value is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        //IF value is enver found, return -1 signifying this
        return -1;
    }
}
