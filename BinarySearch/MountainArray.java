public class MountainArray {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
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
}
