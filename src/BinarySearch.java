public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        System.out.println(search(arr,4,0,arr.length-1));
    }

    //binary search is decision based recursion
    //This does not include any coming up and combining answers
    static int search(int arr[], int target, int start, int end){
        //base condition
        if(start > end){
            return -1;
        }

        int  mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return search(arr,target,start,mid-1);
        }
        else{
            return search(arr,target,mid + 1,end);
        }
    }
}
