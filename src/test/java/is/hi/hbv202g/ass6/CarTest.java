package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    public static final String BEETLE = "Beetle";
    private Car beetle;
    private CarOwner carOwner;

    @Before
    public void setUp(){
        beetle = new Car(BEETLE);
        carOwner = new CarOwner("John Doe", beetle);
    }
    @Test
    public void getNameOfCar() {
        assertEquals(BEETLE, beetle.getName());
    }

}
