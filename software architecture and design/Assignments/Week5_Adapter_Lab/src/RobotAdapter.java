public class RobotAdapter implements RobotController {
    private final LegacyRobot legacyRobot;

    public RobotAdapter(LegacyRobot legacyRobot) {
        this.legacyRobot = legacyRobot;
    }

    @Override
    public void turn(double degrees) {
        // TODO: Convert degrees to radians and call legacyRobot.rotate()
        double rad = degrees * (Math.PI/180);
        legacyRobot.rotate(rad);
    }

    @Override
    public void move(double meters) {
        // TODO: Calculate a speed and (constant) acceleration which, when multipled together, will equal meters, then call legacyRobot.accelerate()
        double speed = 1.0;
        double duration = meters / speed;
        legacyRobot.accelerate(speed, duration);
    }
}
