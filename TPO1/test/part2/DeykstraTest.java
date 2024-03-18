package part2;

import org.junit.Before;
import org.junit.Test;
import part1.CosFunction;
import part2.graph.Edge;
import part2.graph.graphConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeykstraTest {
    Deykstra testDeykstra;
    List<List<Integer>> etalon;

    @Before
    public void setUp() throws Exception {

        testDeykstra = new Deykstra(0, new ArrayList<>());
        etalon = new ArrayList<>();

        Integer[] etalon0 = {0, 11, 10, 3, 5, 11, 10, 8};
        etalon.add(Arrays.asList(etalon0));

        Integer[] etalon1 = {11, 0, 5, 8, 10, 5, 15, 11};
        etalon.add(Arrays.asList(etalon1));

        Integer[] etalon2 = {10,5,0, 13, 5, 7, 10, 8};
        etalon.add(Arrays.asList(etalon2));

        Integer[] etalon25 = {3, 8, 13, 0, 8, 8, 13, 8};
        etalon.add(Arrays.asList(etalon25));

        Integer[] etalon3 = {5, 10, 5, 8, 0, 9, 5, 3};
        etalon.add(Arrays.asList(etalon3));

        Integer[] etalon4 = {11, 5, 7, 8, 9, 0, 14, 6};
        etalon.add(Arrays.asList(etalon4));

        Integer[] etalon5 = {10, 15, 10, 13, 5, 14, 0, 8};
        etalon.add(Arrays.asList(etalon5));

        Integer[] etalon6 = {8, 11, 8, 8, 3, 6, 8, 0};
        etalon.add(Arrays.asList(etalon6));
    }



    @Test
    public void deykstraAlgo2() {
        List<Edge> arr = new ArrayList<>(0);
        int n = 8;
        arr.add(new Edge(1, 4, 3));// 0 3 3
        arr.add(new Edge(1, 5,5 ));// 0 4 5

        arr.add(new Edge(2, 4, 8));// 1 3 8
        arr.add(new Edge(2, 6, 5));// 1 5 5
        arr.add(new Edge(2, 3, 5));// 1 2 5

        arr.add(new Edge(3, 6, 7));// 2 5 7
        arr.add(new Edge(3, 5, 5));// 2 4 5

        arr.add(new Edge(4, 6, 8));// 3 5 8
        arr.add(new Edge(4, 8, 8));// 3 7 8

        arr.add(new Edge(5, 7, 5));// 4 6 5
        arr.add(new Edge(5, 8, 3));// 4 7 3

        arr.add(new Edge(6, 8, 6));// 5 7 6


        testDeykstra.replaceData(n, graphConverter.createCorrelation(n, arr));


        for(int i = 0 ;i < n;i++){
            List<Integer> testAnsI = new ArrayList<>();
            for(int j = 0; j < n;j++){
                if(i == 5){
                    int a = 2;
                    a++;
                }
                testAnsI.add(testDeykstra.DeykstraAlgo(i + 1, j + 1));
            }
            assertEquals(etalon.get(i), testAnsI);
        }

    }


}