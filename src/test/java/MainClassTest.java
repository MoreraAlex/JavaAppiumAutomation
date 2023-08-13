import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        int actual = MainClass.getLocalNumber();
        Assert.assertTrue("Actual result is not equal to 14", actual == expected);
    }
}
