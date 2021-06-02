/**
 * @Author ariful
 */
public class Fan {

    private Direction direction;
    private Speed speed;

    public Fan() {
        this.direction = Direction.FORWARD;
        this.speed = Speed.OFF;
    }

    public Fan pullSpeedCord() {
        speed = direction.equals(Direction.FORWARD) ? speed.next() : speed.prev();
        return this;
    }

    public Fan pullDirectionCord() {
        this.direction = this.direction.changeState();
        return this;
    }

    @Override
    public String toString() {
        return "Fan {" +
                "direction=" + direction +
                ", speed=" + speed +
                '}';
    }
}
