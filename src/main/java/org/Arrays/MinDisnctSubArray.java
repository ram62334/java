

public class MinDisnctSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5};
        int k=2;
        int l=0;
        int r=arr.length;

        for (int i=0;i<arr.length;i++){
            int c=0;
            for (int j=i;j<arr.length-1;j++){
                if (arr[j+1]==arr[j]){
                    break;
                }
                k++;
            }
        }
    }
}
