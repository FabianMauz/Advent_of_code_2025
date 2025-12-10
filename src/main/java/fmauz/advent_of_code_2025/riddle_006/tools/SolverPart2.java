package fmauz.advent_of_code_2025.riddle_006.tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fmauz
 */
public class SolverPart2 {

    public long calculateResult(List<String> lines) {
        long totalSum = 0;
        List<String> rowValues = new ArrayList<>();
        String[] operators = null;
        for (String s : lines) {
            if (s.contains("*") || s.contains("+")) {
                operators = parseOperatorLine(s);
            } else {
                rowValues.add(s);
            }
        }

        List<Block> blocks = seperateBlocks(rowValues, operators);
        for (Block block : blocks) {
            totalSum += calculateBlock(block);
        }
        return totalSum;
    }

    private long calculateBlock(Block block) {
        block.print();
        int blockWidth = block.endIndex - block.startIndex + 1;
        long blockValue = 0;
        if (block.operator.equals("*")) {
            blockValue = 1;
        }
        if (blockWidth == 3) {
            int h = 0;
        }
        for (int i = 0; i < blockWidth; i++) {
            String numberString = "";
            for (int j = 0; j < block.rows; j++) {
                numberString += block.text.substring(i + blockWidth * j, i + blockWidth * j + 1);
            }

            long number = Long.parseLong(numberString.trim());
            if (block.operator.equals("*")) {
                blockValue *= number;
            } else {
                blockValue += number;
            }
        }
        System.out.println("Total value of block " + blockValue);
        return blockValue;
    }

    private List<Block> seperateBlocks(List<String> lines, String[] operators) {
        List<Block> blocks = new ArrayList<>();
        List<Integer> splitPoints = calculateBlockSplitPositions(lines);
        int startIndex = 0;
        int operatorId = 0;
        for (int splitPoint : splitPoints) {
            Block block = new Block();
            block.startIndex = startIndex;
            block.endIndex = splitPoint - 1;
            block.operator = operators[operatorId];
            block.rows = lines.size();
            for (String s : lines) {

                block.text += s.substring(startIndex, splitPoint);
            }

            startIndex = splitPoint + 1;
            operatorId++;
            blocks.add(block);
        }

        return blocks;
    }

    private List<Integer> calculateBlockSplitPositions(List<String> rowValues) {
        List<Integer> splitPoints = new ArrayList<>();
        int lineLength = rowValues.get(0).length();
        for (int i = 0; i < lineLength; i++) {
            boolean isEmptyRow = true;
            for (int j = 0; j < rowValues.size(); j++) {
                if (rowValues.get(j).charAt(i) != ' ') {
                    isEmptyRow = false;
                }
            }
            if (isEmptyRow) {
                splitPoints.add(i);
            }
        }
        return splitPoints;
    }

    private String[] parseOperatorLine(String line) {
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        line = line.replaceAll("  ", " ").trim();
        return line.split(" ");
    }
}
