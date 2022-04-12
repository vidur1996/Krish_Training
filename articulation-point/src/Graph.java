import java.util.*;
import java.util.stream.Collectors;

public class Graph {
    private int vertecentCount;
    private LinkedList<String>[] edges;
    private HashMap<String, Integer> verticent;
    private LinkedList<String>[] edgesList;

    Graph(int v) {
        vertecentCount = v;
        edges = new LinkedList[vertecentCount];
        edgesList = new LinkedList[vertecentCount];
        verticent = new HashMap<>();
        for (int i = 0; i < vertecentCount; i++) {
            edges[i] = new LinkedList<>();
            edgesList[i] = new LinkedList<>();
        }
    }

    private static Set<String> getKeys(
            Map<String, Integer> map, Integer value) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public void addEdges(int index, String parent) {
        edges[index].add(parent);
        edgesList[index].add(parent);
    }

    public void addAdjacent(int index, String parent) {
        try {
            verticent.put(parent, index);
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public HashMap<String, Integer> getVerticents() {
        return verticent;
    }

    public List<String> depthFirst(String root) {
        Stack<String> stack = new Stack<>();
        List<String> dfs = new ArrayList<>();
        dfs.add(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            int index = verticent.get(root);
            int start = 0;
            for (int i = start; i < vertecentCount; i++) {
                if (index == i) {
                    for (String ele : edges[index]) {
                        if (!dfs.contains(ele)) {
                            dfs.add(ele);
                        }
                        edges[index].remove(ele);
                        stack.push(ele);
                        index = verticent.get(ele);
                        start = index;
                        break;
                    }
                }
            }
            stack.pop();
            if (!edges[0].isEmpty()) {
                stack.push(root);
            }
        }
        return dfs;
    }

    public String getElement(int index) {
        String element = "";
        for (String key : getKeys(verticent, index)) {
            element = key;
        }
        return element;
    }

    public String[] putBacktracking(List<String> dfs) {
        Stack<String> dfsStack = new Stack<>();
        String[] backEdges = new String[vertecentCount];
        int index = 0;
        String pre = "";
        for (String s : dfs) {
            dfsStack.push(s);
        }
        while (!dfsStack.isEmpty()) {
            String ele = dfsStack.pop();
            if (!dfsStack.isEmpty()) {
                pre = dfsStack.pop();
                dfsStack.push(pre);
            }
            index = verticent.get(ele);
            for (int i = 0; i < vertecentCount; i++) {
                if (edgesList[i].contains(ele)
                        && verticent.get(pre) != i) {
                    backEdges[index] = getElement(i);
                }
            }
        }
        return backEdges;
    }
}