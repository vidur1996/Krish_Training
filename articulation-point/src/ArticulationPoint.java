import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArticulationPoint {
    private HashMap<String, Integer> lowerIndex;
    private HashMap<String, Integer> depthIndex;

    public HashMap<String, Integer> getDepth(List<String> dfs) {
        HashMap<String, Integer> depth = new HashMap<>();
        int index = 1;
        for (String s : dfs) {
            depth.put(s, index);
            index++;
        }
        depthIndex = depth;
        return depth;
    }

    public HashMap<String, Integer> getLowestIndex(String[] backEdges,
                                                   List<String> dfs,
                                                   HashMap<String, Integer> depth,
                                                   HashMap<String, Integer> verticent
    ) {
        HashMap<String, Integer> lower = new HashMap<>();
        for (int i = 0; i < dfs.size(); i++) {
            if (depth.get((dfs.get(i))) == 1) {
                lower.put(dfs.get(i), 1);
            } else {
                int j = verticent.get(dfs.get(i));
                for (int t = j; t < backEdges.length; t++) {
                    if (backEdges[t] != null) {
                        if (depth.get(backEdges[t]) != 9) {
                            lower.put(dfs.get(i), depth.get(backEdges[t]));
                            break;
                        }
                    }

                }
            }
        }
        lowerIndex = lower;
        return lower;
    }

    public String findArticulationPoint(String parent, String child) {
        if (lowerIndex.get(child) >= depthIndex.get(parent)) {
            return parent;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        ArticulationPoint articulationPoint = new ArticulationPoint();
        List<String> articulationPointList = new ArrayList<String>();

        graph.addAdjacent(0, "A");
        graph.addAdjacent(1, "D");
        graph.addAdjacent(2, "C");
        graph.addAdjacent(3, "B");
        graph.addAdjacent(4, "E");
        graph.addAdjacent(5, "F");
        graph.addAdjacent(6, "G");
        graph.addAdjacent(7, "H");
        graph.addAdjacent(8, "I");

        graph.addEdges(0, "D");
        graph.addEdges(3, "C");
        graph.addEdges(0, "B");
        graph.addEdges(2, "E");
        graph.addEdges(4, "F");
        graph.addEdges(2, "F");
        graph.addEdges(1, "C");
        graph.addEdges(5, "G");
        graph.addEdges(6, "H");
        graph.addEdges(6, "I");
        graph.addEdges(7, "I");

        List<String> getDfs = graph.depthFirst("A");
        String[] backEdges = graph.putBacktracking(getDfs);
        HashMap<String, Integer> verticent = graph.getVerticents();
        HashMap<String, Integer> depth = articulationPoint.getDepth(getDfs);
        articulationPoint.getLowestIndex(backEdges, getDfs, depth, verticent);


        String[][] checkPoints = {{"B", "C"},
                {"C", "E"},{"C", "F"},
                {"F", "G"},{"H", "G"},
                {"H", "I"},{"G", "F"}};

        for(int i=0;i<checkPoints.length;i++){
            String temp = articulationPoint.findArticulationPoint(checkPoints[i][0],checkPoints[i][1]);
            if (temp!=null){
                if(!articulationPointList.contains(temp)) {
                    articulationPointList.add(temp);
                }
            }
        }

        System.out.println("The articulation point for the graph are");
        System.out.println(articulationPointList);

    }
}
