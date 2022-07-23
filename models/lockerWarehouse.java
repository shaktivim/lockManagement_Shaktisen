package lockerLLD_Shaktisen.models;

import java.util.ArrayList;


public class lockerWarehouse {

    // creating a ware house which can hold list of all lockers
    public static ArrayList<Locker> lockerList = new ArrayList<>();


    // adding locker in the warehouse list from manager end
    public void add(Locker l){
        lockerList.add(l);
    }

    
}
