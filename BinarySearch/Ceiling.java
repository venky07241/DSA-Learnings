public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,12,15,16,19,21,25,30};
        int target = 17;
        int ans =ceiling(arr,target);
        System.out.println(ans);
    }

    //return the index of smallest no>=target
    static int ceiling(int[] arr, int target){

        //but when the target is greater than the greatest number in array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while(start<=end){
           int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }


            if(target<arr[mid]){
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
       return start;
    }
}
