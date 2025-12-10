package fmauz.advent_of_code_2025.riddle_006.tools;

/**
 *
 * @author fmauz
 */
public class Block {

    public String text = "";
    public String operator;
    public int startIndex;
    public int endIndex;
    public int rows;

    public void print() {
        int blockWidth = endIndex - startIndex + 1;
        for (int i = 0; i < rows; i++) {
            System.out.println(text.substring(i * blockWidth, (i + 1) * blockWidth));
        }
        System.out.println("--------------");
    }

}
