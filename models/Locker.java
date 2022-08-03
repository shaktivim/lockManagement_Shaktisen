
package lockerLLD_Shaktisen.models;

// creating locker class where we can get and set locker properties

public class Locker {

    // defining locker properties such as its id, passcode, bookingStatus, its space size and locker cost rate per day
    public String lockerId;             //constant
    public String passcode;             //mutable       
    public Boolean bookingStatus;       //mutable
    public int lockerSize;              //constant
    public int lockerRateperDay;        //constant

    // constructor for locker
    public Locker(String lockerId, String passcode, Boolean bookingStatus, int lockerSize, int lockerRateperDay){
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.lockerSize = lockerSize;
        this.lockerRateperDay = lockerRateperDay;
    }
    public String getLockerId() {
        return lockerId;
    }
    public String getPasscode() {
        return passcode;
    }
    public Boolean getBookingStatus() {
        return bookingStatus;
    }
    public int getLockerSize() {
        return lockerSize;
    }
    public int getLockerRateperDay() {
        return lockerRateperDay;
    }

   public void setLockerId(String lockerId) {
       this.lockerId = lockerId;
   }
   public void setPasscode(String passcode) {
       this.passcode = passcode;
   }
   public void setBookingStatus(Boolean bookingStatus) {
       this.bookingStatus = bookingStatus;
   }
   public void setLockerSize(int lockerSize) {
       this.lockerSize = lockerSize;
   }
   public void setLockerRateperDay(int lockerRateperDay) {
       this.lockerRateperDay = lockerRateperDay;
   }

}
