package Arrays;

public class SearchInRotated {
    public static void main(String[] args) {
        int arr[]={6,7,8,1,2,3,4,5};
        int e=6;

        //int p=findPivot(arr);
        int mid=searchel(0,arr.length-1, arr, e);
        System.out.print(mid);
    }

    private static int searchel(int low, int high, int[] arr, int key) {
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if (arr[mid]==key)
                return mid;
            if (arr[low]<arr[mid]){
                if (key>=arr[low]&&key<arr[mid]){
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            else {
                if (key>=arr[mid]&&key<arr[high]){
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
        }
        return -1;
    }

//    private static int findPivot(int[] arr) {
//        int p=0;
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]>arr[i+1]&&arr[i]){
//                p=arr[i];
//                break;
//            }
//        }
//        return p;
//    }
}
