
package lockerLLD_Shaktisen.models;


public class Locker {
    public String lockerId;
    public String passcode;
    public Boolean bookingStatus;
    public int lockerSize;
    public int lockerRateperDay;

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
