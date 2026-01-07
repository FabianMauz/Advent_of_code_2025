package fmauz.advent_of_code_2025.riddle_007;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class Path {

    List<String> nodesLabels = new ArrayList<>();

    public Path(List<String> nodes) {
        this.nodesLabels = nodes;

    }

    public Path(String node) {
        this.nodesLabels.add(node);

    }

    public List<Path> expandPath() {
        List<Path> branchingPathes = new ArrayList<>();
        List<Node> successors = Solver.nodeList.getNodeByLabel(nodesLabels.getLast()).getSuccessors();
        if (successors.isEmpty()) {
            branchingPathes.add(this);
            return branchingPathes;
        }
        for (int i = 0; i < successors.size() - 1; i++) {
            List<String> copy = copyPath();
            copy.add(successors.get(i).getLabel());
            branchingPathes.add(new Path(copy));
        }

        this.nodesLabels.add(successors.getLast().getLabel());
        branchingPathes.add(this);
        return branchingPathes;
    }

    private List<String> copyPath() {
        List<String> copiedPath = new ArrayList<>();
        copiedPath.addAll(nodesLabels);
        return copiedPath;
    }

}
