package fmauz.advent_of_code_2025.riddle_007;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class NodeList {

    public List<Node> nodes = new ArrayList<>();

    public Node addNode(Node node) {

        for (Node n : nodes) {

            if (n.getLabel().equals(node.getLabel())) {
                return n;
            }
        }

        nodes.add(node);
        return node;
    }

    public Node getNodeByLabel(String label) {
        return nodes.stream().filter(n -> n.getLabel().equals(label)).toList().getFirst();
    }

    public Node getStartNode() {
        return nodes.getFirst();
    }

}
