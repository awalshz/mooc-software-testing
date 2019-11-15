package tudelft.myroman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyRomanTest {

    @Test
    public void convert_empty_toint(){
        int result = new MyRoman().toInt("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void convert_I_toint(){
        int result = new MyRoman().toInt("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void convert_XXIV_toint(){
        int result = new MyRoman().toInt("XXIV");
        Assertions.assertEquals(24, result);
    }

    @Test
    public void convert_XLIV_toint(){
        int result = new MyRoman().toInt("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void convert_XCIV_toint(){
        int result = new MyRoman().toInt("XCIV");
        Assertions.assertEquals(94, result);
    }

    @Test
    public void convert_XCVII_toint(){
        int result = new MyRoman().toInt("XCVII");
        Assertions.assertEquals(97, result);
    }

    @Test
    public void convert_CXCI_toint(){
        int result = new MyRoman().toInt("CXCI");
        Assertions.assertEquals(191, result);
    }

    @Test
    public void convert_MCCCXCIX_toint(){
        int result = new MyRoman().toInt("MCCCXCIX");
        Assertions.assertEquals(1399, result);
    }

    @Test
    public void convert_MCDLXXVIII_toint(){
        int result = new MyRoman().toInt("MCDLXXVIII");
        Assertions.assertEquals(1478, result);
    }

    @Test
    public void convert_MMMDCCCXCII_toint(){
        int result = new MyRoman().toInt("MMMDCCCXCII");
        Assertions.assertEquals(3892, result);
    }



}

