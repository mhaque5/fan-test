/**
 * @Author ariful
 */
public class Main {
    public static void main(String args[]) {
        Fan fan = new Fan();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());

        fan.pullDirectionCord();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());

        fan.pullSpeedCord();
        System.out.println(fan.toString());
    }
}
