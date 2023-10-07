import org.junit.Test;
import powerpackage.powerfinder;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one()
    {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2()
    {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4()
    {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX()
    {
        assert powerfinder.OF(3, 2) == 3*3;
    }

    @Test
    public void power_of_3_and_4_IS_81() {
        assert powerfinder.OF(3,4)==9*9;
    }
}
