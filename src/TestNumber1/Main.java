package TestNumber1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 3, 0);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int quantityStepX = Math.abs(toX - robot.getX());
        int quantityStepY = Math.abs(toY - robot.getY());
        switch (robot.getDirection()) {
            case LEFT: {
                robot.turnRight();
                break;
            }
            case RIGHT: {
                robot.turnLeft();
                break;
            }
            case DOWN: {
                robot.turnRight();
                robot.turnRight();
                break;
            }
        }
        if (toY > robot.getY()) {
            for (int i = 0; i < quantityStepY; i++) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            robot.turnRight();
            robot.turnRight();
            for (int i = 0; i < quantityStepY; i++) {
                robot.stepForward();
            }
        }
        if ((toX > robot.getX() && robot.getDirection() == Direction.UP) || (toX < robot.getX() && robot.getDirection() == Direction.DOWN)) {
            robot.turnRight();
            for (int i = 0; i < quantityStepX; i++) {
                robot.stepForward();
            }
        } else if ((toX < robot.getX() && robot.getDirection() == Direction.UP) || (toX > robot.getX() && robot.getDirection() == Direction.DOWN)) {
            robot.turnLeft();
            for (int i = 0; i < quantityStepX; i++) {
                robot.stepForward();
            }
        }
    }
}