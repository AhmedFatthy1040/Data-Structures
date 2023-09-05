public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("A", "D");
        graph.addEdge("C", "D");
        graph.removeEdge("A", "B");
        graph.removeVertex("D");
        graph.printGraph();
    }
}
