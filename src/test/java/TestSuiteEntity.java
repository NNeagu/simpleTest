import org.junit.Assert;
import org.junit.Test;

public class TestSuiteEntity {
    @Test
    public void alwaysFail()
    {
        Assert.assertEquals(1, 2);
    }
    @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 1);
    }
}