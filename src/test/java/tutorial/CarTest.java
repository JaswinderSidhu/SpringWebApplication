package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tutorial.mvc.Car;
import tutorial.mvc.Engine;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by jsidhu on 18/04/16.
 */
public class CarTest {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCarWarning(){
        when(engine.getRpm()).thenReturn(6000);
        car.accelrator();
        assertEquals("Slow Down!",car.getWarningMessage());
    }
}
