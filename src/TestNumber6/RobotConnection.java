package TestNumber6;

public interface RobotConnection extends AutoCloseable {

    RobotConnection k = new RobotConnection() {
        @Override
        public void moveRobotTo(int x, int y) {
            //throw new RobotConnectionException("RobotConnectionException in moveRobotTo");
            System.out.println("Good");
        }

        @Override
        public void close() {
            System.out.println("Close");
        }
    };

    void moveRobotTo(int x, int y);

    @Override
    void close();
}
