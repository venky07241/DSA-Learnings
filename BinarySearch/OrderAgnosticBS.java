public class OrderAgnosticBS {
    public static void main(String[] args) {
       //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99,80,78,65,55,45,3,5,25,15,5};
        int target = 55;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticbs(int[] arr,int target){


    int start = 0;
    int end = arr.length-1;

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
