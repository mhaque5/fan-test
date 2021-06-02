/**
 * @Author ariful
 */
public enum Direction {
    FORWARD(1),
    BACKWARD(-1);
    private final int directionCode;

    Direction(int directionCode) {
        this.directionCode = directionCode;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    public static Direction getDirection(int directionCode) {
        for(Direction direction : Direction.values()) {
            if(direction.getDirectionCode() == directionCode) {
                return direction;
            }
        }
        return null;
    }

    public Direction changeState() {
        return this.getDirection(this.directionCode * -1);
    }
}
