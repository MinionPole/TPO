package part2;

import java.util.*;

public class Deykstra {
    private int  graph_size;
    private List<List<Pair>> correlationList;

    public Deykstra(int  graph_size, List<List<Pair>> data) {
        this.correlationList = data;
        this.graph_size = graph_size;
    }

    public void replaceData(int  graph_size, List<List<Pair>> data) {
        this.correlationList = data;
        this.graph_size = graph_size;
    }


    public int DeykstraAlgo(int start, int end){
        start--;
        end--;
        List<Integer> distances = new ArrayList<Integer>(Collections.nCopies(this.graph_size, 1000000000));
        distances.set(start, 0);

        TreeSet<Pair> queue = new TreeSet<Pair>();
        queue.add(new Pair(start, 0));
        while(!queue.isEmpty()){
            Pair now = queue.first();
            queue.remove(now);
            if(now.second > distances.get(now.first))
                continue;
            for(int i = 0; i < this.correlationList.get(now.first).size();i++) {
                Pair goTo = this.correlationList.get(now.first).get(i);
                int oldDistance = distances.get(goTo.first);
                int newDistance = now.second + goTo.second;
                if(newDistance < oldDistance){
                    distances.set(goTo.first, newDistance);
                    queue.add(new Pair(goTo.first, newDistance));
                }
            }
        }
        if(distances.get(end) == 1000000000)
            return -1;
        else
            return distances.get(end);
    }

}
