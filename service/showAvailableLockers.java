package lockerLLD_Shaktisen.service;

import java.util.ArrayList;
import lockerLLD_Shaktisen.models.Locker;

// class with method  which can check and return list of free or available locker only
public class showAvailableLockers {

    ArrayList<Locker> lockerList = new ArrayList<>();
    
    public ArrayList<Locker> showAvailableLocker(){
        ArrayList<Locker> freeLockers = new ArrayList<>();
        for(Locker lk : lockerList){
            if(lk.bookingStatus == false){              // if locker is not booked then only add it to free locker list
                freeLockers.add(lk);
                System.out.println(lk);
            }
        }
        // return list of free or available lockers only
        return freeLockers;

    }
}
