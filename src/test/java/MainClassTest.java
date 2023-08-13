import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass
{
    //Тест 2: проверка что метод getClassNumber возвращает > 45
    @Test
    public void testGetClassNumber()
    {
        MainClass classNum = new MainClass();
        int actual = classNum.getClassNumber();
        Assert.assertTrue("Actual number lower than 45", actual > 45);
    }

    @Test
    public void testGetLocalNumber()
    {
        //Для большей читаемости кода вынес в отдельные переменные ОР
        int expected = 14;
        int actual = MainClass.getLocalNumber();
        Assert.assertEquals("Actual result is not equal to 14", actual, expected);
    }
}
