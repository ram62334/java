package Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={2,9,31,-4,21,7};
        int k=3;
        int wsum=0;
        int i;
        for(i=0;i<k;i++){
            wsum+=arr[i];
        }
        int max=-1;
        for (int j=k;j<arr.length;j++){
            wsum=wsum-arr[j-k]+arr[j];
            max=Math.max(max,wsum);
        }
        System.out.println(max);
    }
}
