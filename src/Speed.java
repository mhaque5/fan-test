/**
 * @Author ariful
 */
public enum Speed {
    OFF(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int speedCode;

    Speed(int speedCode) {
        this.speedCode = speedCode;
    }

    public int getSpeedCode() {
        return speedCode;
    }

    public static Speed getSpeed(int speedCode) {
        /* Ensures values stays in between 0 to 3 */
        speedCode = Math.floorMod(speedCode, 4);

        for(Speed speed : Speed.values()) {
            if(speed.getSpeedCode() == speedCode) {
                return speed;
            }
        }
        return null;
    }

    public Speed next() {
        return this.getSpeed(this.speedCode + 1);
    }

    public Speed prev() {
        return this.getSpeed(this.speedCode - 1);
    }
}
