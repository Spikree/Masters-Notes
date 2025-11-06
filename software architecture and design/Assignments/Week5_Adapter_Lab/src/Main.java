public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of LegacyRobot
        LegacyRobot robot = new LegacyRobot();

        // TODO: Create an instance of RobotAdapter using the LegacyRobot
        RobotAdapter robotAdapter = new RobotAdapter(robot);

        // TODO: Use controller to turn and move the robot
        robotAdapter.turn(20);

        robotAdapter.move(30);

    }
}