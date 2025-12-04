package org.example.ArrayOrString;

public class GasStation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int station = gasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
        System.out.println("Station: "+station);
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0, sum2=0;
        for(int i=0; i<gas.length; i++){
            sum1+=gas[i];
            sum2+=cost[i];
        }
        if(sum1<sum2){
            return -1;
        }
        int rem_fuel=0;
        int ans=0;
        for(int i=0; i<gas.length; i++){
            rem_fuel+=gas[i]-cost[i];
            if(rem_fuel<0){
                rem_fuel = 0;
                ans = i+1;
            }
        }
        return ans;
    
    }
}
