import java.util.ArrayList;

public class ReturnListWithoutArgument {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6};
        System.out.println(findAllIndex(arr,4,0));
    }

    static ArrayList<Integer> findAllIndex(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        //returns an empty array list
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        //while the recursion calls are getting removed from the stack
        //that is coming from up to down we are going to get only the elements on that
        //particular function call
        //so we are storing the values on every call into another list
        //stores the answers form the below calls
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);

        //and adding the all elements in answersFromBelow to our main list
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
