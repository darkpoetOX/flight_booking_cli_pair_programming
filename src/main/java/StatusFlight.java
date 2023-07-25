public enum StatusFlight {
    ON_TIME("On time"),
    DELAYED("Delayed"),
    DEPARTED("Departed"),
    CANCELLED("Cancelled");

    private final String statusFlight;

    StatusFlight(String statusFlight){
        this.statusFlight = statusFlight;
    }

    public String getStatusFlight(){
        return this.statusFlight;
    }
}


