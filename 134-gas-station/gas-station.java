class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0,total_cost=0;
        for(int i=0;i<gas.length;i++){
            total_gas += gas[i];
            total_cost += cost[i];
        }
        if(total_gas<total_cost){
            return -1;
        }
        int start=0,currGas=0;
        for(int i=0;i<gas.length;i++){
            currGas += gas[i]-cost[i];
            if(currGas<0){
                currGas = 0;
                start = i+1;
            }
        }
        return start;
    }
}