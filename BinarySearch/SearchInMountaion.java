public class SearchInMountaion {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticbs(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticbs(arr,target,peak+1,arr.length-1);

   }
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //your are in dec part of array
                //this may be the ans, but look at left
                //this is why end  !=mid-1
                end=mid;
            }else{
                //you are in asc part of array
                start = mid+1; //because we know mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largesr number because of 2 checks above
        //start and end are always trying to  find max element in the above 2 checks
        //hence when they are pointing to just one element that is max one become that is wt checks say
        //more elaboration
        return start;
    }
    static int orderAgnosticbs(int[] arr,int target, int start, int end){



        //find whether arr is sorted in ascending or descending order

        boolean isAsc = arr[start]<arr[end];



        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                } else if (target<arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
