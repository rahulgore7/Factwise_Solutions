public class Solution {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int arr[]){
        int profit=0;
        int minPrice= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minPrice=Math.min(minPrice, arr[i]);
            profit=Math.max(profit,arr[i]-minPrice);
        }
        return profit;
    }    
}
