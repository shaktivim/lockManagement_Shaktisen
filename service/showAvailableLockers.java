package lockerLLD_Shaktisen.service;

import java.util.ArrayList;


import lockerLLD_Shaktisen.models.Locker;

public class showAvailableLockers {

    ArrayList<Locker> lockerList = new ArrayList<>();
    
    public ArrayList<Locker> showAvailableLocker(){
        ArrayList<Locker> freeLockers = new ArrayList<>();
        for(Locker lk : lockerList){
            if(lk.bookingStatus == false){
                freeLockers.add(lk);
                System.out.println(lk);
            }
        }
        return freeLockers;

    }
}
