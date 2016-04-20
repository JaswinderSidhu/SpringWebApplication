package tutorial;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tutorial.mvc.tutorial.Calculator;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CalculatorTest{
    @Mock
    private Calculator cal;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAbs(){
        when(cal.abs(-20)).thenReturn(20);
        assertEquals(20,cal.abs(-20));

    }
}