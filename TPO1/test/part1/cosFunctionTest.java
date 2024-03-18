package part1;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class cosFunctionTest {
    @Parameterized.Parameter(0)
    public double m1;
    @Parameterized.Parameter(1)
    public double result;

    @Parameterized.Parameters
    public static List<List<Double>> createTestSet() {
        List<List<Double>> ret = new ArrayList<>();
        ret.add(new ArrayList<>());

        ret.get(ret.size() - 1).add(0.0);
        ret.get(ret.size() - 1).add(Math.cos(0.0));

        ret.add(new ArrayList<>());
        ret.get(ret.size() - 1).add(Math.PI/2);
        ret.get(ret.size() - 1).add(Math.cos(Math.PI/2));

        /*ret.get(0).add();
        ret.get(1).add(Math.cos(-Math.PI/2));

        ret.get(0).add(Math.PI);
        ret.get(1).add(Math.cos(Math.PI));

        ret.get(0).add(Math.PI/6);
        ret.get(1).add(Math.cos(Math.PI/6));

        ret.get(0).add(-Math.PI/3);
        ret.get(1).add(Math.cos(-Math.PI/3));*/
        return ret;
    }

    @Test
    public void cosCals() {
        System.out.println(1);
        assertEquals(result, CosFunction.cosCals(m1), 0.001);
    }

}