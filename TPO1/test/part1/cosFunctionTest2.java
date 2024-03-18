package part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class cosFunctionTest2 {

    // fields used together with @Parameter must be public
    @Parameterized.Parameter(0)
    public double m1;
    @Parameterized.Parameter(1)
    public double result;

    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0.0, Math.cos(0.0)}, {Math.PI/2, Math.cos(Math.PI/2)}, {-Math.PI/2, Math.cos(-Math.PI/2)}, {Math.PI, Math.cos(Math.PI)}, {-Math.PI, Math.cos(-Math.PI)}, {-0.95*Math.PI, Math.cos(-0.95*Math.PI)}, {0.95*Math.PI, Math.cos(0.95*Math.PI)}, {Math.PI/6, Math.cos(Math.PI/6)}, {-Math.PI/3, Math.cos(-Math.PI/3)}, {Math.PI/4, Math.cos(Math.PI/4)}, {-Math.PI/4, Math.cos(-Math.PI/4)}, {100.0, Math.cos(100.0)}, {-100.0, Math.cos(-100.0)}};
        return Arrays.asList(data);
    }


    @Test
    public void MultiplyTest() {
        assertEquals(result, CosFunction.cosCals(m1), 0.001);
    }



}