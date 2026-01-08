import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12,34,34,54,6,78,1};

        //System.out.println(find(arr,6,0));
        //System.out.println(findIndex(arr,54,0));
        //System.out.println(findLastIndex(arr,78,arr.length-1));

        //findAllIndex(arr,34,0);
        //System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = findAllIndexList(arr,34,0,list);
        //Both the res and list are same they contain  the same elements
        System.out.println(res);
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

    //Adding the target elememt in to the list if it's occurred more than once
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    //Passing the List as Input
    static ArrayList<Integer> findAllIndexList(int arr[], int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexList(arr,target,index+1,list);
    }
}
