package part2.graph;

import part2.Pair;

import java.util.ArrayList;
import java.util.List;

public class graphConverter {
    public static List<List<Pair>> createCorrelation(int graphSize, List<Edge> input) {
        List<List<Pair>> ret = new ArrayList<>();
        for(int i = 0; i< graphSize;i++){
            ret.add(new ArrayList<Pair>());
        }

        for(int i = 0; i < input.size();i++){
            Edge now = input.get(i);
            ret.get(now.from - 1).add(new Pair(now.to - 1, now.cost));
            ret.get(now.to - 1).add(new Pair(now.from - 1, now.cost));
        }
        return ret;
    }

}
