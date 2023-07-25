import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String destination;
    private String flightID;
    private StatusFlight statusFlight;
    private String airlineName;
    List<Passenger> passengers;

    public Flight(String destination, String flightID, StatusFlight statusFlight, String airlineName, List<Passenger> passengers){
        this.destination = destination;
        this.flightID = flightID;
        this.statusFlight = statusFlight;
        this.airlineName = airlineName;
        this.passengers = new ArrayList<>();

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

    public StatusFlight getStatusFlight() {
        return this.statusFlight;
    }

    public void setStatusFlight(StatusFlight statusFlight) {
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
