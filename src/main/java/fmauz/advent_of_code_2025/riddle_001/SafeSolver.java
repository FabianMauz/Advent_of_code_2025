package fmauz.advent_of_code_2025.riddle_001;

/**
 *
 * @author Fabian Mauz
 */
public class SafeSolver {

    private int currentPosition = 50;
    private int exceededZeroes = 0;
    private boolean useMode0x434C49434 = false;

    public void activateMode0x434C49434() {
        this.useMode0x434C49434 = true;
    }

    public void turnDial(String turnCommand) {
        char direction = turnCommand.charAt(0);
        int amountOfTicks = Integer.parseInt(turnCommand.substring(1));

        amountOfTicks = normalizeTurns(amountOfTicks);
        turn(direction, amountOfTicks);

        if (useMode0x434C49434) {
            exceededZeroes += Math.abs((currentPosition / 100));
            if (currentPosition == 0) {
                exceededZeroes++;
            }
        } else {
            currentPosition = currentPosition % 100;
            if (currentPosition == 0) {
                exceededZeroes++;
            }
        }
        currentPosition = currentPosition % 100;
    }

    private int normalizeTurns(int amountOfTicks) {
        if (useMode0x434C49434) {
            exceededZeroes += (int) amountOfTicks / 100;
            return (amountOfTicks % 100);
        }
        return amountOfTicks;
    }

    private void turn(char direction, int amountOfTicks) {
        if (useMode0x434C49434) {
            handlePassingZero(direction, amountOfTicks);
        }

        if (direction == 'L') {
            turnLeft(amountOfTicks);
        } else {
            turnRight(amountOfTicks);
        }
    }

    private void turnRight(int amountOfTicks) {
        currentPosition += amountOfTicks;
    }

    private void turnLeft(int amountOfTicks) {
        currentPosition -= amountOfTicks;
        if (currentPosition < 0) {
            currentPosition += 100;
        }
    }

    private void handlePassingZero(char direction, int amountOfTicks) {
        if (direction == 'L' && currentPosition > 0 && amountOfTicks > currentPosition) {
            exceededZeroes++;
        }
        if (direction == 'R' && currentPosition < 0 && amountOfTicks > (100 - currentPosition)) {
            exceededZeroes++;
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getExceededZeroes() {
        return exceededZeroes;
    }

}
