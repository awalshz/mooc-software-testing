package tudelft.my_leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LeapYearTest {

    LeapYear obj = new LeapYear();

    @Test
    public void mutltipleOf400isLeap(){
        Assertions.assertTrue(obj.isLeap(2000));
    }

    @Test
    public void multipleof100isNotLeap(){
        Assertions.assertFalse(obj.isLeap(1900));
    }

    @Test
    void multipleOf4isLeap(){
        Assertions.assertTrue(obj.isLeap(756));
    }

    @Test
    void nonMultipleOf4isLeap(){
        Assertions.assertFalse(obj.isLeap(2406));
    }



}
