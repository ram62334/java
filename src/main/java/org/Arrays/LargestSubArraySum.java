

public class LargestSubArraySum {
    public static void main(String[] args) {
        int arr[]={2,9,31,-4,21,7};
        int k=3;
        int csum=0;
        int msum=-1;
        int arr2[]=new int[k];
        for (int i=0;i<=arr.length-k;i++){
            int j;
            csum=0;
            for(j=i;j<(i+k);j++){
                csum+=arr[j];
            }
            if (csum>msum){
                msum=csum;
                int p=i;
                int l=0;
                while(p<j) {
                    arr2[l]=arr[p];
                    l++;
                    p++;
                }
                }
        }
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println(msum);
    }
}
