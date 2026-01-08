public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12,34,54,6,78,1};

        System.out.println(find(arr,6,0));
        System.out.println(findIndex(arr,54,0));
        System.out.println(findLastIndex(arr,78,arr.length-1));
    }
    static boolean find(int arr[], int target, int index){
        //base condition
        //after comparing the elements on indices from 0 to n-1
        //index will become arr.length that is index out of Bound so return false
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndex(int arr[], int target, int index){
        //base condition
        if(index == arr.length){
            return -1;
        }
        //if the element is equal to target return the index
        //otherwise move to next element in array by incrementing the index
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index + 1);
        }
    }

    //If we start comparing the elememt from the last Index of the array
    static int findLastIndex(int arr[], int target, int index){
        //base condition
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findLastIndex(arr,target,index-1);
        }
    }
}
