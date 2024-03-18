package part2.graph;

public class Edge {
    int from; // откуда
    int to; // куда
    int cost; // дистанция

    public Edge(int from, int to, int cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

}
