package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    CaesarShiftCipher obj = new CaesarShiftCipher();
    @Test
    public void charInMiddle(){
        String result = obj.CaesarShiftCipher("a bc", 4);
        Assertions.assertEquals("e fg", result);
    }

    @Test
    public void charInEndOfCircle(){
        String result = obj.CaesarShiftCipher("yzab", 4);
        Assertions.assertEquals("cdef", result);
    }

    @Test
    public void shiftZero(){
        String result = obj.CaesarShiftCipher("yzab", 0);
        Assertions.assertEquals("yzab", result);
    }
    @Test
    public void shiftNegative(){
        String result = obj.CaesarShiftCipher("yzab", -2);
        Assertions.assertEquals("wxyz", result);
    }
}
