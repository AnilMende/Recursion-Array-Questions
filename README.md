1.Sorted Array
Here we are checking the index and index + 1 th elements and 
if the index element is less than index + 1 th elememt then increment the index by 1
and passing the array and index increment to the recursion call or function for the next element checking.
Base Condition : index == arr.length - 1 then we know the array is sorted because the index value will not
be arr.length - 1 if any elements in the array are greater than it's previous element.
