import java.util.List;

public class Flight {

    private String destination;
    private String flightID;
    private String statusFlight;
    private String airlineName;
    List<Passenger> passengers;
    public Flight(String destination, String flightID, String statusFlight, String airlineName, List<Passenger> passengers){
        this.destination = destination;
        this.flightID = flightID;
        this.statusFlight = statusFlight;
        this.passengers = passengers;

    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightID() {
        return this.flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getStatusFlight() {
        return this.statusFlight;
    }

    public void setStatusFlight(String statusFlight) {
        this.statusFlight = statusFlight;
    }

    public String getAirlineName() {
        return this.airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public List<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
