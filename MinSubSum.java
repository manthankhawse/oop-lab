public class MinSubSum
{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int res = Integer.MAX_VALUE;
        int target = 11;
        int sum = 0;
        for(int l = 0, r = 0; r<arr.length; r++){
            sum += arr[r];


            while(l<r && sum>target){
                sum-=arr[l];
                l++;
            }

            if(sum==target){
                res = Math.min(res, r-l+1);
            }

        }

        System.out.println(res==Integer.MAX_VALUE ? 0 : res );
    }
}