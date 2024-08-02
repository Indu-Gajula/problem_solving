package org.example.goldmansachs;

public class StartingEnergyToCrossRoad {

    public static int getTheEnergyRequiredToCrossRoad(int []energies){

        int minimumEnergy = Integer.MAX_VALUE;
        ///find presum array and select minimum from that
        int preSum = 0;
        for(int energy : energies){
            preSum += energy;
            if(preSum < minimumEnergy)
                minimumEnergy = preSum;
        }
        if(minimumEnergy < 0)
                return (-1*minimumEnergy) + 1;
        return 1;
    }
}
