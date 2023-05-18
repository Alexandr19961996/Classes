package TestNumber6;

public class Test {
    public static void main(String[] args) throws Exception {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                //throw new RuntimeException();
                //System.out.println("null");
                //return null;
                return RobotConnection.k;
            }
        };
        moveRobot(robotConnectionManager, 4, 5);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection = null;
        int i = 3;
        while (i != 0) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (i == 1) {
                    throw new RobotConnectionException("RobotConnectionException");
                }
                i--;
            } finally {
                try {
                    if (robotConnection != null) {
                        robotConnection.close();
                    }
                } catch (RuntimeException ignored) {
                }
            }
        }
    }
}