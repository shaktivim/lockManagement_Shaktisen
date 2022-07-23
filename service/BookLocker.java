package lockerLLD_Shaktisen.service;

import lockerLLD_Shaktisen.models.Locker;
import lockerLLD_Shaktisen.models.lockerWarehouse;

// user will request for booking of selected locker from available list
public class BookLocker {
    
    public Locker bookLocker(String userId, String lockerId, String passcode){
        // finding locker with requested lcoker id 
        Locker lock = null;
        lock = getLocker(lockerId);

        // checking booking status of found locker
        Boolean bookingStatus =  lock.bookingStatus;

        // setting locker booking status and its passcode
        if(bookingStatus == false){
            lock.bookingStatus = true;
            lock.passcode = passcode;
        }else{
            System.out.println("Locker is already booked");
            return null;
        }
        
        // returning booked lock for printing
        System.out.println("Your requestd lock is booked");
        return lock;
    }

    public Locker getLocker(String id){

        for(Locker lk : lockerWarehouse.lockerList){
            if(lk.lockerId == id){
                return lk;
            }
        }
        return null;
    }
}
