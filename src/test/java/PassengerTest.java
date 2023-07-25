import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach

    public void setUp(){

        passenger = new Passenger ("Joseph Smith", "07852387495", "P001");

    }

    @Test
    public void canGetPassengerName (){
        assertThat(passenger.getPassengerName()).isEqualTo("Joseph Smith");
    }

    @Test
    public void canSetPassengerName (){
        passenger.setPassengerName("Sandra");
        assertThat(passenger.getPassengerName()).isEqualTo("Sandra");
    }

    @Test
    public void canGetContactPhone (){
        assertThat(passenger.getContactPhone()).isEqualTo("07852387495");
    }

    








}
