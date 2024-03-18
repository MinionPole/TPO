package part2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import part2.graph.Edge;
import part2.graph.graphConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DeykstraTest2 {

    // fields used together with @Parameter must be public
    @Parameterized.Parameter(0)
    public int v1;
    @Parameterized.Parameter(1)
    public int v2;
    @Parameterized.Parameter(2)
    public int result;

    Deykstra testDeykstra;

    @Before
    public void setUp() throws Exception {
        testDeykstra = new Deykstra(0, new ArrayList<>());
        List<Edge> arr = new ArrayList<>(0);
        int n = 4;
        arr.add(new Edge(1, 3, 11));
        arr.add(new Edge(1, 2,2 ));
        arr.add(new Edge(2, 3, 7));;

        testDeykstra.replaceData(n, graphConverter.createCorrelation(n, arr));
    }

    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 2},{1, 1, 0},{1, 3, 9}, {2, 1, 2}, {2,3,7}, {1, 4, -1}};
        return Arrays.asList(data);
    }


    @Test
    public void deykstraAlgo1() {
        assertEquals(result, testDeykstra.DeykstraAlgo(v1, v2));
    }


}