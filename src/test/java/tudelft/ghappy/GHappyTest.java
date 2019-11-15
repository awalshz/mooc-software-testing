package tudelft.ghappy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy obj = new GHappy();

    @Test
    public void zeroGs(){
        Assertions.assertTrue(obj.gHappy("aealknscw"));
    }

    @Test
    public void oneG(){
        Assertions.assertFalse(obj.gHappy("aegez"));
    }

    @Test
    public void oneGatBeginnig(){
        Assertions.assertFalse(obj.gHappy("g"));
    }

    @Test
    public void twoSeparateG(){
        Assertions.assertFalse(obj.gHappy("zefzeglklg"));
    }

    @Test
    public void twoGtogether(){
        Assertions.assertTrue(obj.gHappy("zefzegglkl"));
    }

    @Test
    public void severalGtogether(){
        Assertions.assertTrue(obj.gHappy("zefzeggggglkl"));
    }
}
