public class Solution {
    public static void main(String[] args) {
        int[] gas={2,3,4};
        int[] cost={3,4,3};
        System.out.println(gasStation(gas, cost));
    }
    public static int gasStation(int[] gas, int[] cost){
        int length=gas.length;
        int gasAvailable=0;
        int gasUsed=0;
        int paid=0;
        int startingPoint=0;
        for(int i=0;i<length;i++){
            gasUsed+=gas[i];
            paid+=cost[i];
            gasAvailable+=gas[i]-cost[i];
            if(gasAvailable<0){
                gasAvailable=0;
                startingPoint=i+1;
            }
        }
        return paid>gasUsed ? -1: startingPoint;
    }
}
