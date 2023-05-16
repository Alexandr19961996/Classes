package TestNumber1;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int fromX, int fromY, Direction direction) {
        this.x = fromX;
        this.y = fromY;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.UP;
            case DOWN -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.DOWN;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP -> y++;
            case RIGHT -> x++;
            case DOWN -> y--;
            case LEFT -> x--;
        }
    }
}
