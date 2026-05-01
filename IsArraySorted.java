package RecursionM;

//Q)Check if array is sorted or not using Recursion(Strictly Increasing)
public class IsArraySorted {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //Array is sorted till now
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2};
        System.err.println(isSorted(arr, 0));
    }
}
