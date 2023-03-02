package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String JOHN_DOE = "John Doe";
    private Car beetle;
    private CarOwner carOwner;

    @Before
    public void setUp(){
        beetle = new Car("Beetle");
        carOwner = new CarOwner(JOHN_DOE, beetle);
    }
    @Test
    public void getName() {
        assertEquals(JOHN_DOE, carOwner.getName());
    }

}