package fmauz.advent_of_code_2025.riddle_007;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Node {

    private List<Node> successors = new ArrayList<>();
    private String label;

    public Node(String label) {
        this.label = label;
    }

    public void addSuccNode(Node n) {
        this.successors.add(n);
    }

    public List<Node> getSuccessors() {
        return successors;
    }

    public String getLabel() {
        return label;
    }

}
