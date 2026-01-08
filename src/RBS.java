public class RBS {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));
    }

    static int search(int arr[], int target, int s, int e){
        //means array is not sorted
        if(s > e){
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }

        //if arr[s] <= arr[m] means the array is sorted from s to m
        //checking if the target lies in the first half or not
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                //then the search space will be form s to m
                //and s , m will be the new s and e
                //pass them in to the function call
                //end will become mid-1
                return search(arr,target,0,m-1);
            }
            else{
                //target is not in the range of s to m
                //so move start to left
                return search(arr, target,m+1,e);
            }
        }

        //checking if the target lies in the second half
        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target,m+1,e);
        }

        return search(arr,target,s,m-1);
    }
}
