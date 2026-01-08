public class Sorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int arr[], int index){
        //base condition
        //index only equals to arr.length - 1 when the array is sorted so return true
        //otherwise the index will be the last sorted element index
        if(index == arr.length - 1){
            return true;
        }
        //we are checking the index and index + 1 th elements
        //if the index is less than index + 1 element then increment the index
        //we are passing the same array only changing the index
        return arr[index] < arr[index + 1] && sorted(arr, index+1);
    }
}
