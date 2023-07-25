public class Passenger {

    private String passengerName;
    private String contactPhone;

    private String passengerID;



    public Passenger (String passengerName, String contactPhone, String passengerID){
        this.passengerName = passengerName;
        this.contactPhone = contactPhone;
        this.passengerID = passengerID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getPassengerID() {
        return this.passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }




}
