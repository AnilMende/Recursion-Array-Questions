1.Sorted Array : 
Here we are checking the index and index + 1 th elements and 
if the index element is less than index + 1 th elememt then increment the index by 1
and passing the array and index increment to the recursion call or function for the next element checking.
Base Condition : index == arr.length - 1 then we know the array is sorted because the index value will not
be arr.length - 1 if any elements in the array are greater than it's previous element.

2.Linear Search : 
check if the element on index is equal to target or not
if it is true then return the index, otherwise make a function call
return search(arr , target, index + 1) by incrementing index
Base condition is index == arr.length then return false or -1 indicates element is not found

3.Linear Search For Multiple Occurencess : 
If the target is occurred multiple times then we need to return all of their indexes
For that Create a list(ArrayList) add the index to the list if the element at the particular index is equal to target
else peroform return search(arr, target, index+1)

4.Return the List Without Including it as the argument :
If we initialize a list, on every call back new list will be created.
while coming down every call back returns a new list where their outputs are not same and excludes other callbacks outputs.
For this we store the output of the previous callback in a list and then add the all the elements into the main list using
i.e. list.addAll(andForBelowCallback) then return list;

5.Roated Binary Search :
Here we need to find the target values index position in the rotated sorted array.
initialize start to 0 and end to arr.length - 1, then mid = start + (end - start) / 2
=> Check whether the target lies in the left of the mid or in the right of the mid
=> checking is arr[start] <= arr[mid] by this we know elements from start to mid are sorted order
case 1 => if target >= arr[start] && target <= arr[mid] this tells us that the target is in between the start and mid
so the new search space will be or perform search in :  return search(arr,target,0,mid-1)
else : return search(arr,target, mid + 1, end)

case 2 => if target >= arr[mid] && target <= arr[end] then taret is in between the search space mid+1 to end
so the start will become mid + 1 : return search(arr, target, mid + 1, end)

it the above conditions are invalid move end to right that is end = mid - 1:
return search(arr,target, 0, mid-1)


