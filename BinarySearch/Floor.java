public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,12,15,16,19,21,25,30};
        int target = 26;
        int ans =floor(arr,target);
        System.out.println(ans);
    }
    //return index of greatest no <=target
    static int floor(int[] arr, int target){



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
        return end;
    }
}
