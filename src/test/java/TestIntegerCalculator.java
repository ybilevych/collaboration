import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Yevhen.Bilevych on 26.03.2018.
 */
public class TestIntegerCalculator {
    @Test
    public void testMultiplication() {
        Assert.assertEquals(4, IntegerCalculator.multiply(2, 2));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(3, IntegerCalculator.divide(6, 2));
    }
}
